package delegate.SimpleDelegate;

/**
 * Created By Rick 2019/3/18
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doWork(String command) {
        System.out.println("develop pay function");
    }
}
