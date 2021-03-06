package study.daydayup.wolf.business.uc.api.setting.entity;

import lombok.Data;
import study.daydayup.wolf.framework.layer.api.Model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * study.daydayup.wolf.business.uc.api.setting.entity
 *
 * @author Wingle
 * @since 2020/1/1 11:09 上午
 **/
@Data
public class AccountStatus extends Status{
    @NotNull @Min(1)
    private Long accountId;



}
