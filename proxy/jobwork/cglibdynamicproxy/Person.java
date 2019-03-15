package proxy.jobwork.cglibdynamicproxy;

import proxy.jobwork.jdkdynamicproxy.HKShopping;

/**
 * Created By Rick 2019/3/15
 */
public class Person implements HKShopping {
    @Override
    public int doShopping() {
        System.out.println("I want to buy Iphone");
        return 0;
    }
}
