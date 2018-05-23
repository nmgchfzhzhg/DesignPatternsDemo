package com.designpatterns.demo.creational.factory.java;

/**
 * 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午2:15
 * @project_name DesignPatternsDemo
 */
public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
