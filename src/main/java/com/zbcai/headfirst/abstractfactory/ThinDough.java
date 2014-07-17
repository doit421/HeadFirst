package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/28.
 * 薄饼，继承面团接口
 */
public class ThinDough implements Dough {
    @Override
    public void use() {
        System.out.println("使用薄饼");
    }
}
