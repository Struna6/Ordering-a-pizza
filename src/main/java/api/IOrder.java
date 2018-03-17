package api;

import implementation.Pizza;

public interface IOrder
{
    void printOrder();
    void addPosition(Pizza pizza);
}
