package com.designpatterns.demo.behavioral.strategy.kotlin

/**
 * 高级会员折扣类 具体策略实现，封装了算法的实现
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/31 上午9:58
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class AdvancedMember : Member {
    override fun calcPrice(booksPrice: Double): Double {
        println("高级会员的折扣为20%")
        return booksPrice * 0.8
    }
}