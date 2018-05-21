package com.designpatterns.demo.abstractfactory.kotlin


/**
 * 创建抽象工厂类，定义具体的公共接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/21 上午10:03
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class Factory{

    //生成容器类产品
    abstract fun ManufactureContainer(): Product

    //生成磨具类产品
    abstract fun ManufactureMould(): Product
}