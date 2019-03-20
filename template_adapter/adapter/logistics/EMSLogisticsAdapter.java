package adapter.logistics;

/**
 * Created By Rick 2019/3/20
 */
public class EMSLogisticsAdapter implements Logistics {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof Logistics;
    }

    @Override
    public ResultMsg sendGoods() {
        System.out.println("使用EMS物流渠道发货");
        return null;
    }
}
