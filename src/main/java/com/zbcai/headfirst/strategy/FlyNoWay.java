package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/5.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞行");
    }
}
