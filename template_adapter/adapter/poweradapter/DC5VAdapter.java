package adapter.poweradapter;

/**
 * Created By Rick 2019/3/19
 */
public class DC5VAdapter implements DC5V {
    private AC220 ac220;

    public DC5VAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int outPut = ac220.outputAC220V();
        System.out.println("输出outputDC"+outPut/44+"V");
        return outPut/44;
    }
}
