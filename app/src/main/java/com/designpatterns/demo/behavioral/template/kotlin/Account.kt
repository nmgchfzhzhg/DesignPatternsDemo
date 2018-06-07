package com.designpatterns.demo.behavioral.template.kotlin

/**
 * 抽象模板角色类
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/7 上午11:51
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class Account{

//    继承父类并覆盖父类函数时，Kotlin要求父类必须有open标注，被覆盖的函数必须有open标注，并且子类的函数必须加override标注
//    如果父类的这个函数没有标注open，则子类中不允许定义同名函数，不论加不加override。在一个final类中（即没有声明open的类），函数上也不允许加open标注。
    fun calculateInterest(): Double {
        val interestRate = doCalculateInterestRate()
        val accountType = doCalculateAccountType()
        val amount = calculateAmount(accountType)
        return amount * interestRate

    }

    //基本方法，留给子类实现
    protected abstract fun doCalculateAccountType(): String

    //    基本方法，留给子类实现
    protected abstract fun doCalculateInterestRate(): Double

    protected fun calculateAmount(accountType: String): Double {
        return 7222.00
    }
}