package delegate.SimpleDelegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By Rick 2019/3/18
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> map = new HashMap<String, IEmployee>();

    public Leader() {
        map.put("pay",new EmployeeA());
        map.put("cart",new EmployeeB());
    }

    @Override
    public void doWork(String command) {
        if(map.containsKey(command)){
            map.get(command).doWork(command);
        }else {
            System.out.println("you put wrong code");
        }
    }
}
