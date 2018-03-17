package configuration;

import api.IOrder;
import api.IPizza;
import implementation.ExclusivePizza;
import implementation.Order;
import implementation.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    @Bean
    public IPizza pizza()
    {
        return new Pizza("Margherita", 15);
    }

    @Bean
    public Pizza DodajPizza()
    {
        return new Pizza("Prosciutto",18);
    }

    @Bean
    public IPizza pizzaExcl()
    {
        return new ExclusivePizza("Specjalna", 20);
    }

}
