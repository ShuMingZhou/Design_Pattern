package adapter.logistics;

/**
 * Created By Rick 2019/3/20
 */
public class DHLLogisticsAdapter implements Logistics{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof Logistics;
    }

    @Override
    public ResultMsg sendGoods() {
        System.out.println("使用DHL物流渠道发货");
        return null;
    }
}
