package strategy.promotionstrategy;

/**
 * Created By Rick 2019/3/18
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("Groupbuy promotion");
    }
}
