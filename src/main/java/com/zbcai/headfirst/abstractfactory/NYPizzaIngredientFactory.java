package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/28.
 * 纽约原料工厂，提供纽约特有的面团酱料等原料
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new SweetSauce();
    }
}
