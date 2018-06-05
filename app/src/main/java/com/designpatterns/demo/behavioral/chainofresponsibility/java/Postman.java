package com.designpatterns.demo.behavioral.chainofresponsibility.java;

/**
 * 创建抽象处理者类 快递员抽象类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/5 上午11:53
 * @project_name DesignPatternsDemo
 */
public abstract class Postman {

    public Postman nextPostman;

    public abstract void handleCourier(String adress);

}
