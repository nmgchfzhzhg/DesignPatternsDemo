package com.designpatterns.demo.behavioral.iterator.kotlin

import com.designpatterns.demo.behavioral.iterator.java.ConcreteAggregate

/**
 *
 * 迭代模式测试
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:44
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {

    val aggregate = ConcreteAggregate()
    aggregate.add("111")
    aggregate.add("222")
    aggregate.add("333")
    aggregate.add("444")
    aggregate.add("555")

    val iterator = aggregate.iterator()
    while (iterator.hasNext()) {
        val tel = iterator.next() as String
        println("当前号码为：$tel")
    }
    println("没有号码")

}