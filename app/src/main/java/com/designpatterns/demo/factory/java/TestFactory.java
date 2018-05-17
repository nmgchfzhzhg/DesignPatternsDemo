package com.designpatterns.demo.factory.java;

import com.designpatterns.demo.factory.kotlin.FactoryA;

/**
 * 外界通过调用具体工程类的方法，从而创建不同具体产品类的实例
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午2:17
 * @project_name DesignPatternsDemo
 */
public class TestFactory {

    public static void main(String[] args) {
//        生产A产品
        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();
//        生产B产品
        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
    }
}
