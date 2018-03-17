package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class Order implements IOrder
{
    private List<IPizza> pizzas;
    @Override
    public void printOrder()
    {
        int suma=0;
        for(IPizza n: pizzas)
        {
            System.out.println(n.getName() + "\t" + n.getPrice());
            suma+=n.getPrice();
        }
        System.out.println("\n\nRazem:\t" + suma);
    }

    @Override
    public void addPosition(IPizza pizza)
    {
        pizzas.add(pizza);
    }

    public Order(@Qualifier("Ta") IPizza pizza)
    {
        pizzas = new LinkedList<>();
        pizzas.add(pizza);
    }

}
