package delegate.SimpleDelegate;

/**
 * Created By Rick 2019/3/18
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doWork(String command) {
        System.out.println("develop cart function");
    }
}
