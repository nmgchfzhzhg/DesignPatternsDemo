package com.designpatterns.demo.behavioral.strategy.kotlin

/**
 * 中级会员折扣类 具体策略实现，封装了算法的实现
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/31 上午9:57
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class IntermediateMember:Member {
    override fun calcPrice(booksPrice: Double): Double {
        println("中级会员折扣为10%")
        return booksPrice * 0.9
    }
}