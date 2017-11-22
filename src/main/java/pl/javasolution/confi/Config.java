package pl.javasolution.confi;

import impl.Goodpizza;
import impl.Order;
import order.IOrder;
import order.IPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new Goodpizza(15,"dobra");
    }
    @Bean
    public IOrder order(IPizza pizza){
        return new Order(pizza);
    }
}
