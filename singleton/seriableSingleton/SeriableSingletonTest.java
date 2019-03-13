package singleton.seriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created By Rick 2019/3/13
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            //s2的实例写入内存中
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(s2);
            out.flush();
            out.close();
            //s2的实例从内存中读取出来
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream in = new ObjectInputStream(fis);
            s1= (SeriableSingleton)in.readObject();
            in.close();

            System.out.println(s1);
            System.out.println(s2);
            //true是实例没有被破坏，反之实例被破坏了
            System.out.println(s1 == s2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
