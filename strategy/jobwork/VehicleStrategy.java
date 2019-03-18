package strategy.jobwork;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Rick 2019/3/18
 */
public class VehicleStrategy {
    public static String AIRPLANE = "Airplane";
    public static String BUS = "Bus";
    public static String RAILWAY = "RailWay";
    public static String HIGHSPEEDRAILWAY = "HighSpeedRailWay";

    private static Map<String,Vehicle> vihicle = new HashMap<String,Vehicle>();

    static {
        vihicle.put(AIRPLANE,new Airplane());
        vihicle.put(BUS,new Bus());
        vihicle.put(RAILWAY,new RailWay());
        vihicle.put(HIGHSPEEDRAILWAY,new HighSpeedRailWay());
    }

    public static Vehicle selectVihicleTool(String vihicleTool){
        if(!vihicle.containsKey(vihicleTool)){
            return vihicle.get("RailWay");
        }
        return vihicle.get(vihicleTool);
    }


}
