package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 * 纽约辣香肠披萨
 */
public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        name="纽约辣香肠披萨";
        dough="薄饼";
        sauce="大蒜番茄酱";
        toppings.add("意大利高级干酪");
    }

    /*
    * 重写烘烤方法
    * */
    @Override
    void bake(){
        System.out.println("烘烤，300°，三十分钟");
    }
}
