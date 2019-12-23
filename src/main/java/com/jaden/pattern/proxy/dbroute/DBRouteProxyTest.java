package com.jaden.pattern.proxy.dbroute;

import com.jaden.pattern.proxy.dbroute.proxy.OrderServiceStaticProxy;
import com.sun.tools.corba.se.idl.constExpr.Or;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DBRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/12/23");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
