package cloneable.simpleClone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Rick 2019/3/14
 */
//浅克隆
public class PrototypeTest {
    public static void main(String[] args) {
        CloneCreatePrototypeA cloneCreatePrototype = new CloneCreatePrototypeA();
        cloneCreatePrototype.setAge(45);
        cloneCreatePrototype.setName("rick");
        List hobbies = new ArrayList<String>();
        hobbies.add("playing_buskeyble");
        cloneCreatePrototype.setHobbies(hobbies);
        System.out.println(cloneCreatePrototype);
        Client client = new Client(cloneCreatePrototype);
        CloneCreatePrototypeA cloneCreatePrototypeA = (CloneCreatePrototypeA)client.startClone(cloneCreatePrototype);
        System.out.println(cloneCreatePrototypeA);
        System.out.println("克隆对象中的引用类型地址值：" + cloneCreatePrototypeA.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + cloneCreatePrototype.getHobbies());
        System.out.println("对象地址比较："+(cloneCreatePrototypeA.getHobbies() == cloneCreatePrototype.getHobbies()));

        /*测试结果
        cloneable.CloneCreatePrototypeA@14ae5a5
        cloneable.CloneCreatePrototypeA@7f31245a
        克隆对象中的引用类型地址值：[playing_buskeyble]
        原对象中的引用类型地址值：[playing_buskeyble]
        对象地址比较：true
         */

        /*
        从测试结果看出hobbies 的引用地址是相同的，意味着复制的不是值，而是引用的地址。
        这样的话， 如果我们修改任意一个对象中的属性值， cloneCreatePrototype 和
        cloneCreatePrototypeA 的hobbies 值都会改变。这就是我们常说的浅克隆。只是完整
        复制了值类型数据，没有赋值引用对象。换言之，所有的引用对象仍然指向原来的对象，
        显然不是我们想要的结果。
         */
    }
}
