package com.zbcai.headfirst.factorymethod;

/**
 * Created by czb on 2014/6/24.
 * 芝加哥奶酪披萨
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name="芝加哥奶酪披萨";
        dough="厚饼";
        sauce="小番茄酱";
        toppings.add("意大利白干酪");
    }

    /*
    * 重写切片方法
    * */
    @Override
    void cut(){
        System.out.println("切片，切成方片");
    }
}
