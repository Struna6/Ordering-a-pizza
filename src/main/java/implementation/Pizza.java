package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements IPizza
{
    private String name;
    private int price;

    @Override
    public int getPrice()
    {
        return price;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public Pizza(@Value("Zwykła") String name, @Value("15") int price)
    {
        this.name = name;
        this.price = price;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}
