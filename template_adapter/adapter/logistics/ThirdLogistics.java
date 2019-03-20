package adapter.logistics;

/**
 * Created By Rick 2019/3/20
 */
public interface ThirdLogistics {
    ResultMsg sendGoodsbyDHL();
    ResultMsg sendGoodsbyUPS();
    ResultMsg sendGoodsbyEMS();
}
