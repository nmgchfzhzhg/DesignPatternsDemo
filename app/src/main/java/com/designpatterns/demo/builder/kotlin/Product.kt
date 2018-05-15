package com.designpatterns.demo.builder.kotlin

/**
 * 产品类，创建产品角色
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/14 下午3:10
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Product {

    private var name: String? = null

    private var price: Int = 0

    fun show() = println("名字：$name,价格：$price")

    fun setName(name: String) = this.name == name

    fun setPrice(price: Int) = this.price == price

}