package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 * 纽约奶酪披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name="纽约奶酪披萨";
        dough="薄饼";
        sauce="大蒜番茄酱";
        toppings.add("意大利高级干酪");
    }
}
