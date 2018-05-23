package com.designpatterns.demo.creational.abstractfactory.java;

/**
 * 创建具体工厂（继承抽象工厂类），定义创建对应具体产品实例的方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 下午2:00
 * @project_name DesignPatternsDemo
 */
public class FactoryB extends Factory {
    @Override
    public Product ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public Product ManufactureMould() {
        return new MouldProductB();
    }
}
