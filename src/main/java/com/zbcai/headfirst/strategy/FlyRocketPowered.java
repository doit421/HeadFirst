package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/6.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("使用火箭动力飞行");
    }
}
