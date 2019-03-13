package singleton.enumSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created By Rick 2019/3/13
 */
//注册式单例还有另一种写法，容器缓存的写法
//容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的
//Spring中的做法，就是用这种注册式单例
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
