package study.daydayup.wolf.sdk.aliyun.oss;

import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.utils.BinaryUtil;
import com.aliyun.oss.model.MatchMode;
import com.aliyun.oss.model.PolicyConditions;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import study.daydayup.wolf.common.util.lang.StringUtil;
import study.daydayup.wolf.common.util.time.DateUtil;
import study.daydayup.wolf.sdk.InvalidSdkConfigException;

import javax.annotation.Resource;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * study.daydayup.wolf.sdk.aliyun.oss
 *
 * @author Wingle
 * @since 2020/3/25 6:21 下午
 **/
@Slf4j
@Component
public class AliyunOssUtil {
    private static final int SIGNATURE_EXPIRE_TIME = 300;
    private static final int URL_EXPIRE_TIME = 3600;
    private static final long MIN_CONTENT_LENGTH = 0;
    private static final long MAX_CONTENT_LENGTH = 1048576000;

    @Resource
    private AliyunOssConfig ossConfig;

    public void validOssConfig() {
        if (null == ossConfig.getAccessId() || null == ossConfig.getAccessKey()) {
            throw new InvalidSdkConfigException("invalid aliyun oss config: accessId and accessKey can't be null");
        }

        if (null == ossConfig.getEndpoint()) {
            throw new InvalidSdkConfigException("invalid aliyun oss config: endpoint can't be null");
        }
    }

    public Map<String, String> createSignature() {
        return createSignature(ossConfig.getRootPath(), ossConfig.getDefaultBucket());
    }

    public Map<String, String> createSignature(String dir) {
        if (null == ossConfig.getDefaultBucket()) {
            throw new IllegalArgumentException("aliyun oss bucket can't be null");
        }
        return createSignature(dir, ossConfig.getDefaultBucket());
    }

    public Map<String, String> createSignature(String dir, String bucket) {
        OSS client = createClient();
        PolicyConditions policy = createPolicy(dir);

        LocalDateTime expireAt = LocalDateTime.now().plusSeconds(SIGNATURE_EXPIRE_TIME);
        String policyString = client.generatePostPolicy(DateUtil.asDate(expireAt), policy);

        String signature = client.calculatePostSignature(policyString);
        String encodedPolicy = encodePolicy(policyString);

        return formatSignature(signature, encodedPolicy, dir, bucket, expireAt);
    }

    public String encode(@NonNull String str) {
        OSS client = createClient();

        String[] items = StringUtil.split(str, "://");
        if (items.length != 2) {
            throw new IllegalArgumentException("invalid oss url");
        }

        String bucket = items[0];
        String path = StringUtil.ltrim(items[0], "/");
        LocalDateTime expireAt = LocalDateTime.now().plusSeconds(URL_EXPIRE_TIME);
        URL url = client.generatePresignedUrl(bucket, path, DateUtil.asDate(expireAt));

        return url.toString();
    }

    private OSS createClient() {
        validOssConfig();
        return new OSSClientBuilder().build(
                ossConfig.getEndpoint(),
                ossConfig.getAccessId(),
                ossConfig.getAccessKey()
        );
    }

    private String formatUrl(String bucket, String path) {
        return StringUtil.join( getBaseUrl(bucket), path );
    }

    private String getBaseUrl(String bucket) {
        return StringUtil.join("//", bucket, ".", ossConfig.getEndpoint());
    }

    private Map<String, String> formatSignature(@NonNull String signature, @NonNull String policy, String dir, String bucket, LocalDateTime expireAt) {
        Map<String, String> resp = new HashMap<>(8);
        resp.put("accessId", ossConfig.getAccessId());
        resp.put("policy", policy);
        resp.put("signature", signature);
        resp.put("directory", dir);
        resp.put("hostname", getBaseUrl(bucket));
        resp.put("expireAt", expireAt.toString());

        return resp;
    }

    private String encodePolicy(@NonNull String policyString) {
        byte[] binaryData = policyString.getBytes(StandardCharsets.UTF_8);
        return BinaryUtil.toBase64String(binaryData);
    }

    private PolicyConditions createPolicy(String path) {
        PolicyConditions policy = new PolicyConditions();
        policy.addConditionItem(PolicyConditions.COND_CONTENT_LENGTH_RANGE, MIN_CONTENT_LENGTH, MAX_CONTENT_LENGTH);

        if (null != path) {
            policy.addConditionItem(MatchMode.StartWith, PolicyConditions.COND_KEY, path);
        }

        return policy;
    }


}
