package com.zbcai.headfirst.strategy;

/**
 * Created by czb on 2014/6/5.
 */
public abstract class Duck {
    FlyBehavior fly;
    QuackBehavior quack;

    public abstract void display();

    public void performFly() {
        fly.fly();
    }

    public void performQuack() {
        quack.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        fly = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quack = qb;
    }
}
