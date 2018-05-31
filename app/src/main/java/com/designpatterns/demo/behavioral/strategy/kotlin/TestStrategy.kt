package com.designpatterns.demo.behavioral.strategy.kotlin

/**
 * 测试策略模式
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/31 上午10:04
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
//    初级会员
    val primaryMember = PrimaryMember()
    val primaryPrice = Price(primaryMember)
    println(primaryPrice.quote(200.0))
//    中级会员
    val intermediateMember = IntermediateMember()
    val interPrice = Price(intermediateMember)
    println(interPrice.quote(100.0))
//    高级会员
    val advancedMember = AdvancedMember()
    val advanceprice = Price(advancedMember)
    println(advanceprice.quote(300.0))

}