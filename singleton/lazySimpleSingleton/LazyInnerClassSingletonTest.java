package singleton.lazySimpleSingleton;


import java.lang.reflect.Constructor;

/**
 * Created by Rick 2019/3/12
 */
//测试内部类通过反射构造出来的实例来测试内部类的单例是否是唯一的，经测试发现不是唯一的单例；
//可以在私有的构造方法中去判断，如果传到构造中的值不等于null，就抛一个导常，阻止通过反射来创建一个新的单例
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try{
            //很无聊的情况下，进行破坏
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);
            //因为构造方法是私有的，这里设置强制访问，强吻，不愿意也要吻
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();

            //调用了两次构造方法，相当于new了两次
            //犯了原则性问题，
            Object o2 = LazyInnerClassSingleton.getInstance();
            //如果是true说明new出来的对象是同一个对象，反之false的话说明单例被破坏了
            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

