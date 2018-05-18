package com.designpatterns.demo.abstractfactory.java;

/**
 * 创建抽象工厂类，定义具体的公共接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 上午11:21
 * @project_name DesignPatternsDemo
 */
abstract class Factory {
    //生成容器类产品
    public abstract Product ManufactureContainer();

    //生成磨具类产品
    public abstract Product ManufactureMould();

}
