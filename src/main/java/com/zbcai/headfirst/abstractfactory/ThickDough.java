package com.zbcai.headfirst.abstractfactory;

/**
 * Created by czb on 2014/6/28.
 * 厚饼，继承面团接口
 */
public class ThickDough implements Dough {
    @Override
    public void use() {
        System.out.println("使用厚饼");
    }
}
