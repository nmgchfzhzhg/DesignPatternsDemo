package com.designpatterns.demo.creational.abstractfactory.java;

/**
 * 创建抽象产品类，定义具体产品的公共接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 上午11:26
 * @project_name DesignPatternsDemo
 */
abstract class ContainerProduct extends Product {
    @Override
    public abstract void Show();
}
