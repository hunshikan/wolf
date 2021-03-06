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
public enum NotifyReturnEnum implements CodeBasedEnum {
    TIMEOUT(10, "timeout"),
    USELESS(5, "useless notification"),
    PARSE_ERROR(4, "parse error"),
    DUPLICATE(3, "duplicate"),
    FAIL(2, "fail"),
    SUCCESS(1, "success"),
    ;

    private int code;
    private String name;

    NotifyReturnEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
