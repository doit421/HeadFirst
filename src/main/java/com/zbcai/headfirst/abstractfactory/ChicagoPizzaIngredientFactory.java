package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 芝加哥原料工厂，提供芝加哥特有的面料酱料等原料
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
