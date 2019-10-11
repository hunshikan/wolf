package study.daydayup.wolf.business.trade.api.entity;

import lombok.Data;
import study.daydayup.wolf.business.trade.api.vo.BuyerMessage;
import study.daydayup.wolf.business.trade.api.vo.SelfFetchAddress;
import study.daydayup.wolf.business.trade.api.vo.SellerMemo;
import study.daydayup.wolf.business.trade.api.vo.TradeAddress;

/**
 * study.daydayup.wolf.business.trade.api.entity
 *
 * @author Wingle
 * @since 2019/10/4 12:04 AM
 **/
@Data
public class Order extends BaseOrder {
    private int deliveryMethod;
    private int postagePaymentMethod;

    private TradeAddress address;
    private SelfFetchAddress selfFetchAddress;

    private BuyerMessage buyerMessage;
    private SellerMemo sellerMemo;

    private OrderLine[] orderLines;
}