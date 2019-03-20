package adapter.logistics;


/**
 * Created By Rick 2019/3/20
 */
//第三方物流接口
public interface Logistics {
    boolean support(Object adapter);
    ResultMsg sendGoods();
}
