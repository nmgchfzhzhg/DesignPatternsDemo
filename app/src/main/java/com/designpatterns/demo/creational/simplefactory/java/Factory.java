package com.designpatterns.demo.creational.simplefactory.java;

/**
 * 创建工程类，通过创建静态方法传入不同参数创建不同产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/15 下午4:01
 * @project_name DesignPatternsDemo
 */
public class Factory {

    public static Product Manufacture(String productName) {
        switch (productName) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }

}
