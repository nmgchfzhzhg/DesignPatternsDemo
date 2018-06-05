package com.designpatterns.demo.behavioral.chainofresponsibility.kotlin

/**
 * 测试责任链模式
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午2:38
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
    val beijingPostman=BeijingPostman()
    val shanghaiPostman=ShanghaiPostman()
    val guangzhouPostman=GuangzhouPostman()

    beijingPostman.nextPostman=shanghaiPostman
    shanghaiPostman.nextPostman=guangzhouPostman

    println("有一个上海快递需要派送")
    beijingPostman.handleCourier("Shanghai")
    beijingPostman.handleCourier("Guangzhou")
    println("有一个美国快递需要派送:")
    beijingPostman.handleCourier("America")
}