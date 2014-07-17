package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 披萨商店抽象类
 */
public abstract class PizzaStore {
    //订购披萨
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();//准备原料
        pizza.dough.use();
        pizza.sauce.use();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
