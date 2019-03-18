package strategy;

import strategy.promotionstrategy.*;

/**
 * Created By Rick 2019/3/18
 */

public class PromotionStrategyTest {

//    public static void main(String[] args) {
//        //此代码存在多种优惠活动同时进行
//        PromotionActivity activity618 = new PromotionActivity(new CashbackStrategy());
//        PromotionActivity activity1111 = new PromotionActivity(new GroupbuyStrategy());
//        activity618.execute();
//        activity1111.execute();
//    }

    //引用singleton模式和简单factory模式创建PromotionStrategyFactory 类，通过PromotionStrategyFactory调用静态方法，获取优惠对象
    public static void main(String[] args) {
        String PromotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotion(PromotionKey));
        promotionActivity.execute();
    }
}
