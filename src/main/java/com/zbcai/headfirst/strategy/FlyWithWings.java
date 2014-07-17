package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/5.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("使用翅膀飞行");
    }
}
