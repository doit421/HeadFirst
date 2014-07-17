package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 纽约披萨商店，继承于披萨商店抽象类
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory();
        if(type.equals("pizzaone")){
            pizza = new PizzaOne(ingredientFactory);
            pizza.setName("披萨1（纽约）");
        }
        if(type.equals("pizzatwo")){
            pizza=new PizzaTwo(ingredientFactory);
            pizza.setName("披萨2（纽约）");
        }
        return pizza;
    }
}
