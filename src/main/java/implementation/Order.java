package implementation;

import api.IOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order implements IOrder
{
    private List<Pizza> pizzas;
    @Override
    public void printOrder()
    {
        int suma=0;
        for(Pizza n: pizzas)
        {
            System.out.println(n.getName() + "\t" + n.getPrice());
            suma+=n.getPrice();
        }
        System.out.println("\n\nRazem:\t" + suma);
    }

    @Override
    public void addPosition(Pizza pizza)
    {
        pizzas.add(pizza);
    }

    public Order()
    {
        pizzas = new LinkedList<>();
    }

    public Order(Pizza pizza)
    {
        pizzas = new LinkedList<>();
        pizzas.add(pizza);
    }

}
