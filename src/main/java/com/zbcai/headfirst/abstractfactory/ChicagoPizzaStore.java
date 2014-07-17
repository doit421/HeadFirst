package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 芝加哥披萨商店，继承于抽象披萨商店
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
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
