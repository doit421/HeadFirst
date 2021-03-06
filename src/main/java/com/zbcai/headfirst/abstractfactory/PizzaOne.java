package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 披萨1，根据不同的地区，可以传入不同的原料工厂，那么就做出不同的披萨
 */
public class PizzaOne extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PizzaOne(PizzaIngredientFactory ingredientFactory){
        pizzaIngredientFactory=ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("准备"+name);
        dough=pizzaIngredientFactory.createDough();
        sauce=pizzaIngredientFactory.createSauce();
    }
}
