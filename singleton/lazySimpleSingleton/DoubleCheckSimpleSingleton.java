package singleton.lazySimpleSingleton;

/**
 * Created By Rick 2019/3/12
 */
public class DoubleCheckSimpleSingleton {
//    private static DoubleCheckSimpleSingleton doubleCheckSimpleSingleton;
    //加volatile关键字，可以避免止令重排序问题
    private volatile static DoubleCheckSimpleSingleton doubleCheckSimpleSingleton;

    private DoubleCheckSimpleSingleton(){}
    //双重检查锁，
    public static DoubleCheckSimpleSingleton getInstance(){
        if(doubleCheckSimpleSingleton == null){
            //多线程的情况下是可以走到13行，这样就不会造成整个类死
            synchronized (DoubleCheckSimpleSingleton.class){
                if(doubleCheckSimpleSingleton == null){
                    doubleCheckSimpleSingleton = new DoubleCheckSimpleSingleton();
                    //CPU执行止令会转换成JVM指令执行
                    //这里在执行1，2，3，4步指令时的顺序会不一样，这样会出现指令重排序的问题，加volatile解决此问题
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazy指向刚分配的内存地址
                    //4.初次访问对象
                }
            }
        }
        return doubleCheckSimpleSingleton;
    }
}
