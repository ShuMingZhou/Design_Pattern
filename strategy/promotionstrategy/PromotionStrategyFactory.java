package strategy.promotionstrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Rick 2019/3/18
 */
//促销策略工厂
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> promotion = new HashMap<String,PromotionStrategy>();

    static {
        promotion.put(PromotionKey.CASHBACK, new CashbackStrategy());
        promotion.put(PromotionKey.COUPON, new CouponStrategy());
        promotion.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private PromotionStrategyFactory() { }

    private static final PromotionStrategy promo = new EmptyStrategy();

    public static PromotionStrategy getPromotion(String promotionkey){
        PromotionStrategy promotionStrategy = promotion.get(promotionkey);
        return promotionStrategy == null ? promo : promotionStrategy;
    }

    private interface PromotionKey {
        static final String CASHBACK = "CASHBACK";
        static final String COUPON = "COUPON";
        static final String GROUPBUY = "GROUPBUY";
    }
}
