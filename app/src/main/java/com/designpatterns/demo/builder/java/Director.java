package com.designpatterns.demo.builder.java;

/**
 * 指挥者，利用具体创建者创建产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:50
 * @project_name DesignPatternsDemo
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildName();
        builder.buildPrice();

        return builder.getProduce();
    }
}
