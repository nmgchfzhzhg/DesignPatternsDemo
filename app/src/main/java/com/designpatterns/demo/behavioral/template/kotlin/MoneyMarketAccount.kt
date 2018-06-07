package com.designpatterns.demo.behavioral.template.kotlin

/**
 * 具体模板角色类
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/7 下午1:40
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class MoneyMarketAccount:Account(){


    override fun doCalculateAccountType(): String ="Money Market"

    override fun doCalculateInterestRate(): Double=0.045

}