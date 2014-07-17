package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/29.
 * 披萨抽象类
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void prepare();//准备原料的抽象方法，各个不同的地区可以使用不同的原料

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
