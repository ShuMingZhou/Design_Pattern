package strategy.promotionstrategy;

/**
 * Created By Rick 2019/3/18
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("CashPromotion,the money will be return by alipay");
    }
}
