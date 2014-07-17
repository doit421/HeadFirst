package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 装饰类（饮料的调料），也可以使用接口来定义
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
