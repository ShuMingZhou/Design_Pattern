package proxy.dbroute;

import proxy.dbroute.proxy1.OrderServiceDynamicProxy;
import proxy.dbroute.proxy1.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tom on 2019/3/10.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

//            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

           IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());//动态代理
//            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());//静态代理
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
