package com.designpatterns.demo.builder.kotlin

/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/14 下午1:29
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */

abstract class Builder{

    abstract fun buildName()

    abstract fun buildPrice()

    abstract fun getProduce():Product
}
