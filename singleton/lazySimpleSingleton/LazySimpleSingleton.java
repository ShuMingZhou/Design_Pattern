package singleton.lazySimpleSingleton;

/**
 * Created By Rick 2019/3/12
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton;

    private LazySimpleSingleton(){}
    //synchronized加在static修饰的类方法，在性能方面有可能造成整个类锁死
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton == null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
