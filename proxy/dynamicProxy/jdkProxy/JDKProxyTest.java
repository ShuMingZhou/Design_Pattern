package proxy.dynamicProxy.jdkProxy;


import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * Created by Tom on 2019/3/10.
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            //代理的对象必须实现接口，否则会报找不到方法;比如new Girl()对象必须要实现Person接口，
            // 才能使用代理，让代理去完成代理对象的业务
            Object obj = new JDKMeipo().getInstance(new Girl());
            Method method = obj.getClass().getMethod("findLove",null);
            method.invoke(obj);

//            obj.findLove();
            //代理动态扫描代理对象的所有方法，然后生成一个新的代理类
            //$Proxy0
//            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Girl.class});
//            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
//            os.write(bytes);
//            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
