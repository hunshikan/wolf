package study.daydayup.wolf.business.goods.api.dto.trade;

import lombok.Data;
import study.daydayup.wolf.business.goods.api.entity.Sku;
import study.daydayup.wolf.business.goods.api.enums.GoodsStateEnum;
import study.daydayup.wolf.business.goods.api.vo.Installment;
import study.daydayup.wolf.business.goods.api.vo.Loan;
import study.daydayup.wolf.framework.layer.api.DTO;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.List;

/**
 * study.daydayup.wolf.business.goods.api.dto.response
 *
 * @author Wingle
 * @since 2019/12/12 10:09 上午
 **/
@Data
public class GoodsDTO implements DTO {
    private Long id;
    @Min(1)
    private Long orgId;
    private Long categoryId;
    /**
     * @see study.daydayup.wolf.business.goods.api.enums.GoodsTypeEnum
     */
    private Integer goodsType;
    @NotBlank
    private String name;
    @DecimalMin("0.0001")
    private BigDecimal price;
    @Min(1)
    private Integer currency;
    private Integer chargeUnit;

    /**
     * @see GoodsStateEnum
     */
    private Integer state;
    /**
     * @see study.daydayup.wolf.business.goods.api.enums.StockTypeEnum
     */
    private Integer stockType;

    private String mainPic;
    private String code;

    private Integer version;

    private Sku sku;
    private Loan loan;
    private List<Installment> installmentList;

    private BigDecimal postage = BigDecimal.ZERO;
}
