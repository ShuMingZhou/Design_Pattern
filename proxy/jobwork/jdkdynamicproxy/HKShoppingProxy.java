package proxy.jobwork.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created By Rick 2019/3/15
 */
public class HKShoppingProxy implements InvocationHandler {
    private Object target;
    public Object getInstance(Object person) throws Exception{
        this.target = person;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }

    private void before(){ System.out.println("买一个正版的IPhone"); }

    private void after(){
        System.out.println("正版的话，帮我买了");
    }
}
