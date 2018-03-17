package main;

import api.IOrder;
import configuration.Config;
import implementation.Order;
import implementation.Pizza;
import api.IPizza;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String args[])
    {
        /*
        Pizza p1 = new Pizza("Margerita", 17);
        Pizza p2 = new Pizza("Prosciutto", 20);
        Order o1 = new Order(p1);
        o1.addPosition(p2);
        o1.printOrder();
        */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Order o1 = (Order) context.getBean(Order.class);
        o1.printOrder();
        Pizza p1 = (Pizza) context.getBean("DodajPizza");
        o1.addPosition(p1);
        o1.printOrder();
    }
}
