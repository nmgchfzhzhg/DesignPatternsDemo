package com.designpatterns.demo.abstractfactory.java;


/**
 * 创建具体工厂（继承抽象工厂类），定义创建对应具体产品实例的方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 下午1:52
 * @project_name DesignPatternsDemo
 */
public class FactoryA extends Factory {
    @Override
    public Product ManufactureContainer() {
        return new ContainerProductA();
    }

    @Override
    public Product ManufactureMould() {
        return new MouldProductA();
    }
}
