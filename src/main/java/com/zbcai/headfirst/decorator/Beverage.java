package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 饮料抽象类，所有的具体饮料类型及装饰类型（调料）都需要继承这个类
 */
public abstract class Beverage {

    String description="未知饮料";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
