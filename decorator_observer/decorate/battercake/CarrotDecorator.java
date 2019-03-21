package decorate.battercake;

/**
 * Created By Rick 2019/3/20
 */
public class CarrotDecorator extends BattercakeDecorate {
    public CarrotDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个胡罗卜";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
