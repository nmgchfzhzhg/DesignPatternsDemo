package com.designpatterns.demo.builder.kotlin


/**
 * 测试类
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 上午11:21
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {

    println("建造者模式测试类")

    var product:Product

    val director=Director()

    val builder1=ConcreteBuilder1()

    director.setBuilder(builder1)
    product= director.construct()!!
    product.show()

    val builder2=ConcreteBuilder2()

    director.setBuilder(builder2)
    product= director.construct()!!
    product.show()


}