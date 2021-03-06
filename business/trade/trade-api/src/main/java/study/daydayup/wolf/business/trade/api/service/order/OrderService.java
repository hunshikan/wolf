package study.daydayup.wolf.business.trade.api.service.order;

import study.daydayup.wolf.business.trade.api.dto.order.OrderOption;
import study.daydayup.wolf.business.trade.api.dto.TradeId;
import study.daydayup.wolf.business.trade.api.dto.tm.trade.RelatedTradeRequest;
import study.daydayup.wolf.business.trade.api.domain.entity.Order;
import study.daydayup.wolf.framework.rpc.Result;

import java.util.List;

/**
 * study.daydayup.wolf.business.trade.api.service.tm
 *
 * @author Wingle
 * @since 2019/10/9 6:56 下午
 **/
public interface OrderService {
    Result<Object> create(Order order);
    Result<Object> modify(Order key, Order changes);
    Result<Order> find(TradeId tradeId);
    Result<Order> find(TradeId tradeId, OrderOption option);



    @Deprecated
    Result<List<Order>> findRelatedTrade(RelatedTradeRequest request);
}
