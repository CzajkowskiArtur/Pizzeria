package impl;

import order.IPizza;

public class Goodpizza implements IPizza {
private int price;
private String name;

    public Goodpizza(int price, String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
