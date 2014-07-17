package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 摩卡（调料）
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        //构造函数，传入需要装饰的实例
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //完善饮料描述
        return beverage.getDescription() + ",摩卡";
    }

    @Override
    public double cost() {
        return 2 + beverage.cost();
    }
}
