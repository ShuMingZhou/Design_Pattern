package template.clock;

/**
 * Created By Rick 2019/3/19
 */
public class EmployeeA extends Clock {
    private int i = 0;

    public EmployeeA(int i) {
        this.i = i;
    }

    @Override
    protected int overTime() {
        return this.i;
    }
    @Override
    public void checkClock() {
        if(this.i > 0){
            System.out.println("6点后需要加班"+ this.i +"小时");
        }else{
            System.out.println("6点打卡下班");
        }
    }
}
