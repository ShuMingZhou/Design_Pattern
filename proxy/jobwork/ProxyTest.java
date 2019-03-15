package proxy.jobwork;

import proxy.jobwork.cglibdynamicproxy.HKProxy;
import proxy.jobwork.jdkdynamicproxy.Person;

/**
 * Created By Rick 2019/3/15
 */
public class ProxyTest {
    public static void main(String[] args) {

           //JDK代理的对象必须实现接口，否则会报找不到方法;比如new Person()对象必须要实现HKShopping接口，
           // 才能使用代理，让代理去完成代理对象的业务
//        try {
//           Object b =  new HKShoppingProxy().getInstance(new Person());
//           Method m = b.getClass().getMethod("doShopping",null);
//           m.invoke(b);
//       }catch (Exception e){
//           e.printStackTrace();
//       }

        //动态代理GLIB测试
        //注意不可以代理final修饰的类
        try {
            Person p = (Person) new HKProxy().getInstance(Person.class);
            p.doShopping();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
