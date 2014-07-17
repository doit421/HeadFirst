package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/28.
 * 披萨原料工厂接口
 */
public interface PizzaIngredientFactory {
    public Dough createDough();//使用面料
    public Sauce createSauce();//使用酱料
}
