package delegate.SimpleDelegate;

/**
 * Created By Rick 2019/3/18
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doWork(command);
    }
}
