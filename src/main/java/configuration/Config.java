package configuration;

import api.IOrder;
import api.IPizza;
import implementation.Order;
import implementation.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Bean
    public Pizza pizza()
    {
        return new Pizza("Margherita", 15);
    }

    @Bean
    public Order order(Pizza pizza)
    {
        return new Order(pizza);
    }

    @Bean
    public Pizza DodajPizza()
    {
        return new Pizza("Prosciutto",18);
    }
}
