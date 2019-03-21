package decorate.battercake;

/**
 * Created By Rick 2019/3/20
 */
//抽象类继承抽象类并把继承的抽象对象做一个静态存储对象
public abstract class BattercakeDecorate extends Battercake {
    //静态代理，委派
    private Battercake battercake;

    public BattercakeDecorate(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
