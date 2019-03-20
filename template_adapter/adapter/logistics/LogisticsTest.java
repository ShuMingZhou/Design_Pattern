package adapter.logistics;

/**
 * Created By Rick 2019/3/20
 */
public class LogisticsTest {
    public static void main(String[] args) {

        ThirdLogistics adapter = new UserThirdLogisticsAdapter();
//        ((UserThirdLogisticsAdapter) adapter).sendGoodsBySelfLogistics();
        adapter.sendGoodsbyDHL();

    }
}
