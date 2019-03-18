package strategy.jobwork;

/**
 * Created By Rick 2019/3/18
 */
public class VehicleTest {
    public static void main(String[] args) {
        //选择出行公具
        String name = "HighSpeedRailWay";
        SelectVihicle selectTools = new SelectVihicle(name);
        Vehicle vehicle = selectTools.selectVihicleTool();
        String vehicleToos = vehicle.getName();
        System.out.println(vehicleToos);
    }
}
