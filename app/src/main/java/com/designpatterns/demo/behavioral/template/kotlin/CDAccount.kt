package com.designpatterns.demo.behavioral.template.kotlin

/**
 * 具体模板角色类
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/7 下午1:43
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class CDAccount : Account() {

    override fun doCalculateAccountType(): String = "Certificate of Deposite"

    override fun doCalculateInterestRate(): Double = 0.06

}
