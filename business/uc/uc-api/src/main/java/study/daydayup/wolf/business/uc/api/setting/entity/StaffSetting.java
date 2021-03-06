package study.daydayup.wolf.business.uc.api.setting.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * study.daydayup.wolf.business.uc.api.setting.entity
 *
 * @author Wingle
 * @since 2020/1/1 11:11 上午
 **/
@Data
public class StaffSetting extends KvData {
    @NotNull @Min(1)
    private Long accountId;
    @NotNull @Min(1)
    private Long orgId;
}
