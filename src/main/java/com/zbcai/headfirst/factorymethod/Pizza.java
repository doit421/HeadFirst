package com.zbcai.headfirst.factorymethod;

import java.util.ArrayList;

/**
 * Created by czb on 2014/6/24.
 * 披萨抽象类，所有具体的披萨都要继承此类
 */
public abstract class Pizza {
    public String getName() {
        return name;
    }

    String name;//名称
    String dough;//面团
    String sauce;//酱料
    ArrayList<String> toppings = new ArrayList<String>();//佐料

    //准备阶段
    void prepare() {
        System.out.println("准备 " + name);
        System.out.println("揉面");
        System.out.println("添加酱料");
        System.out.print("添加佐料：");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(toppings.get(i) + " ");
        }
        System.out.println();
    }

    void bake() {
        System.out.println("烘烤，350°二十五分钟");
    }

    void cut() {
        System.out.println("切片，切成斜角");
    }

    void box() {
        System.out.println("包装，使用默认披萨盒");
    }
}
