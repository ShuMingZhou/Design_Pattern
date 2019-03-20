package adapter;

import adapter.poweradapter.AC220;
import adapter.poweradapter.DC5VAdapter;

/**
 * Created By Rick 2019/3/19
 */
//适配器模式
public class DC5VTest {
    public static void main(String[] args) {
        DC5VAdapter d = new DC5VAdapter(new AC220());
        d.outputDC5V();
    }

}
