package com.zbcai.headfirst.decorator;

/**
 * Created by czb on 2014/6/10.
 * 浓缩咖啡
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
