package study.daydayup.wolf.business.goods.api.dto.request;

import lombok.Builder;
import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Request;

/**
 * study.daydayup.wolf.business.goods.api.dto.request
 *
 * @author Wingle
 * @since 2019/12/11 7:28 下午
 **/
@Data
@Builder
public class GoodsOption extends Request {
    private boolean withDetail          = false;
    private boolean withSku             = false;
    private boolean withStatistics      = false;
    private boolean withStock           = false;
    private boolean withLoan            = false;
}
