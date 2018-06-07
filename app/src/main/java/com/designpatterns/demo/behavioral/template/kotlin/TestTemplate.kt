package com.designpatterns.demo.behavioral.template.kotlin

/**
 * 测试模板方法
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/7 下午1:45
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
    val account=MoneyMarketAccount()
    println("货币市场账号的利息数额为："+account.calculateInterest())
    val account1=CDAccount()
    println("定期账号的利息数额为："+account.calculateInterest())




}