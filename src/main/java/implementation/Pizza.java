package implementation;

import api.IPizza;

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

    public Pizza(String name, int price)
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
