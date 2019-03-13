package singleton.threadLocalSingleton;

import singleton.lazySimpleSingleton.ExcutorThread;
/**
 * Created By Rick 2019/3/13
 */
//经测试证明本地线程在线程内部是安全的，反之线程外是不安全的
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExcutorThread());
        Thread t2 = new Thread(new ExcutorThread());
        t1.start();
        t2.start();
        System.out.println("End");

    }
}
