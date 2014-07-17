package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 * 披萨商店
 */
public abstract class PizzaStore {
    //订购披萨
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
