package template.clock;

/**
 * Created By Rick 2019/3/19
 */
public abstract class Clock {
    //获取工作时间
    public final void getWorkSheet(){
        //打上班卡
        this.clockOn();
        //打下班卡
        if(overTime() >= 0 && overTime() <= 3 ){//加班时间范围
            checkClock();
        }else{
            System.out.println("太晚了，注意身体，打卡回家休息吧");
        }
    }

    abstract void checkClock();

    //勾子方法，做逻辑语句执行微调
    protected int overTime() { return 0; }

    final void clockOn() {
        System.out.println("9点钟打上班卡");
    }
}
