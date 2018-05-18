package com.designpatterns.demo.abstractfactory.java;

/**
 * 创建抽象产品类，定义具体产品的公共接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 上午11:28
 * @project_name DesignPatternsDemo
 */
abstract class MouldProduct extends Product {
    @Override
    public abstract void  Show();
}
