package com.designpatterns.demo.abstractfactory.kotlin


/**
 * 客户端通过实例化具体的工程类，并调用其创建不同目标产品的方法创建不同具体产品类的实例
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/21 上午10:10
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
    val factoryA = FactoryA()
    val factoryB = FactoryB()
//        A厂生产容器A产品
    factoryA.ManufactureContainer().Show()
//        A厂生产模具A产品
    factoryA.ManufactureMould().Show()
//        B厂生产容器B产品
    factoryB.ManufactureContainer().Show()
//        B厂生产容器B产品
    factoryB.ManufactureMould().Show()
}
