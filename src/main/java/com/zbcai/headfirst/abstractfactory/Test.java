package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        nyStore.orderPizza("pizzaone");
        nyStore.orderPizza("pizzatwo");

        PizzaStore chicagoStore=new ChicagoPizzaStore();
        chicagoStore.orderPizza("pizzaone");
    }
}
