package study.daydayup.wolf.common.lang.enums.unit;

import lombok.Getter;
import study.daydayup.wolf.common.lang.enums.CodeBasedEnum;

/**
 * study.daydayup.wolf.common.lang.enums
 * range(1000~2000)
 *
 * @author Wingle
 * @since 2019/9/29 4:51 PM
 **/
@Getter
public enum CountableUnitEnum implements CodeBasedEnum {
    QUANTITY(1000, "quantity")
    ;

    private int code;
    private String name;

    CountableUnitEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
