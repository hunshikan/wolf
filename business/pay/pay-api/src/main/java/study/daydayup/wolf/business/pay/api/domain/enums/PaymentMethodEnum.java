package study.daydayup.wolf.business.pay.api.domain.enums;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

/**
 * study.daydayup.wolf.common.lang.enums
 *
 * @author Wingle
 * @since 2019/9/29 4:51 PM
 **/
@Getter
public enum PaymentMethodEnum implements CodeBasedEnum {

    RAZOR_PAYOUT(102, "razor payout"),
    RAZORPAY(101, "razorpay"),

    WECHAT_PAY(2, "wechat pay"),
    ALIPAY(1, "alipay")
    ;

    private int code;
    private String name;

    PaymentMethodEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
