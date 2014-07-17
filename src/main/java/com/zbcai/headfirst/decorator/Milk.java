package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 牛奶（调料）
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        //构造函数，传入需要装饰的实例
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //完善饮料描述
        return beverage.getDescription() + ",牛奶";
    }

    @Override
    public double cost() {
        //计算价格
        return 3 + beverage.cost();
    }
}
