package singleton.enumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created By Rick 2019/3/13
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        try {
            EnumSingleton instance1 = null;
            EnumSingleton instance2 = EnumSingleton.getInstance();
            //注册Object实例
           instance2.setData(new Object());
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(instance1.getData());
            System.out.println(instance2.getData());
            //枚举式单例被反射时是不会被破坏的
            System.out.println(instance1.getData() == instance2.getData());
        }catch (Exception e) {
            e.printStackTrace();
        }

        //ContainerSingletonTest
        Object obj = ContainerSingleton.getBean("singleton.enumSingleton.Student");
        System.out.println(obj);
    }
}
