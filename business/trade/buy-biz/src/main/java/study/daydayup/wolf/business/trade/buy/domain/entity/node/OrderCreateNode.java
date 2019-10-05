package study.daydayup.wolf.business.trade.buy.domain.entity.node;

import study.daydayup.wolf.business.trade.api.dto.buy.request.BuyRequest;
import study.daydayup.wolf.business.trade.api.dto.buy.response.BuyResponse;
import study.daydayup.wolf.business.trade.buy.domain.entity.context.TradeFlowContext;

/**
 * study.daydayup.wolf.business.trade.buy.domain.entity.node
 *
 * @author Wingle
 * @since 2019/10/5 12:10 PM
 **/
public class OrderCreateNode extends AbstractTradeFlowNode implements TradeFlowNode {
    @Override
    public void run(BuyRequest request, BuyResponse response, TradeFlowContext context) {

    }
}