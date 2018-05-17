package com.designpatterns.demo.simplefactory.kotlin


/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 下午4:37
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
    val factory = Factory()
    factory.Manufacture("A")!!.Show()
    factory.Manufacture("B")!!.Show()
    val createFactory =CreateFactory()
    createFactory.CreateFactory(ProductA::class.java)
    createFactory.CreateFactory(ProductB::class.java)
}