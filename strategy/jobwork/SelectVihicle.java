package strategy.jobwork;

/**
 * Created By Rick 2019/3/18
 */
public class SelectVihicle {
    public String vihicle;

    public SelectVihicle(String vihicle) {
        this.vihicle = vihicle;
    }

    public Vehicle selectVihicleTool(){
        return VehicleStrategy.selectVihicleTool(vihicle);
    }
}
