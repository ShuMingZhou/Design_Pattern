package decorate.battercake;

/**
 * Created By Rick 2019/3/20
 */
public class SausageDecorator extends BattercakeDecorate {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }
    //子类继承父类，修改父类参数
    @Override
    protected String getMsg() {
        return super.getMsg() + "加一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
