package strategy.promotionstrategy;

/**
 * Created By Rick 2019/3/18
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("CouponPromotion,课程的价格直接减优惠券面值抵扣");
    }
}
