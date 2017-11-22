import order.IOrder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.confi.Config;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        IOrder order = (IOrder)context.getBean("order");
        order.printOrder();
    }
}
