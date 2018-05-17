package com.designpatterns.demo.factory.kotlin

/**
 * 外界通过调用具体工程类的方法，从而创建不同具体产品类的实例
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午3:14
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {

    val factoryA=FactoryA()
    factoryA.Manufacture().show()

    val factoryB=FactoryB()
    factoryB.Manufacture().Show()


}