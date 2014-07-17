package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/5.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        fly = new FlyNoWay();
        quack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}