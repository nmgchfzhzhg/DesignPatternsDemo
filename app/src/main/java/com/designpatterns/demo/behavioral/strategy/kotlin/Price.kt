package com.designpatterns.demo.behavioral.strategy.kotlin

/**
 * 价钱类 用来操作策略的上下文环境
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/31 上午9:59
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Price(val member:Member){
    fun quote(booksPrice: Double): Double {
        return this.member.calcPrice(booksPrice)
    }
}