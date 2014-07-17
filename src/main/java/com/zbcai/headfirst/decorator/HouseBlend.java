package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 综合咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "综合咖啡";
    }

    @Override
    public double cost() {
        return 12;
    }
}
