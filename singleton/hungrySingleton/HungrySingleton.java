package singleton.hungrySingleton;

/**
 * 2019/3/12
 */
//饿汉式单例
// 它是在类加载的时候就立即初始化，并且创建单例对象

//优点：没有加任何的锁、执行效率比较高，
//在用户体验上来说，比懒汉式更好

//缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间
//浪费了内存，有可能占着茅坑不拉屎

//绝对线程安全，在线程还没出现以前就是实例化了，不可能存在访问安全问题
public class HungrySingleton {
    //先静态、后动态
    //先属性、后方法
    //先上后下
    //final修饰的变量对象是不会被改变的
//    private static final HungrySingleton hungrySingleton = new HungrySingleton();
//    private HungrySingleton(){};

    private static final HungrySingleton hungrySingleton;
    private HungrySingleton(){};
    //代码块里加载
    static{
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
