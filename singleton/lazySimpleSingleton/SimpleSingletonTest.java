package singleton.lazySimpleSingleton;

/**
 * Created By Rick 2019/3/12
 */
public class SimpleSingletonTest {

    public static void main(String[] args) {
        ExcutorThread excutorThread = new ExcutorThread();
        Thread thread1 = new Thread(excutorThread);
        Thread thread2 = new Thread(excutorThread);
        thread1.start();
        thread2.start();
        System.out.println("Excutor End");
    }
}
