package com.designpatterns.demo.creational.builder.kotlin

/**
 * 具体的创建者，实现创建方法
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 上午10:20
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ConcreteBuilder1 : Builder() {


    private val product: Product

    init {
        this.product = Product()
    }

    override fun buildName(){
        product.setName("套餐1")
    }

    override fun buildPrice() {
        product.setPrice(10)
    }
    override fun getProduce(): Product = product

}