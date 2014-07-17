package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/6.
 */
public class SuperDuck extends Duck {
    public SuperDuck() {
        fly = new FlyWithWings();
        quack = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("我是超级鸭子");
    }
}
