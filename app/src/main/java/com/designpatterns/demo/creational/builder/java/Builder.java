package com.designpatterns.demo.creational.builder.java;

/**
 * 抽象建造者，创建产品实例并返回
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:43
 * @project_name DesignPatternsDemo
 */
public abstract class Builder {

    public abstract void buildName();

    public abstract void buildPrice();

    public abstract Product getProduce();


}
