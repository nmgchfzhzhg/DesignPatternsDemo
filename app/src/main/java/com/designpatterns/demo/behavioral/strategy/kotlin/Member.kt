package com.designpatterns.demo.behavioral.strategy.kotlin

/**
 * 抽象折扣类 提供具体策略类需要实现的接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/31 上午9:52
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
interface Member {
    fun calcPrice(booksPrice: Double): Double
}