package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("pepperoni");

        PizzaStore chStore=new ChicagoPizzaStore();
        chStore.orderPizza("veggie");
    }
}
