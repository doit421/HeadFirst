package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/5.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱");
    }
}
