package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 * 芝加哥披萨店
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
