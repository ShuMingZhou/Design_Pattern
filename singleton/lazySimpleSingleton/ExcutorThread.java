package singleton.lazySimpleSingleton;

/**
 * Created By Rick 2019/3/12
 */
public class ExcutorThread implements  Runnable{
    @Override
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        DoubleCheckSimpleSingleton singleton = DoubleCheckSimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
