package com.designpatterns.demo.builder.kotlin

/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 上午11:18
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ConcreteBuilder2 : Builder() {

    private val product: Product;

    init {
        this.product = Product()
    }

    override fun buildName() {

    product.setName("套餐2")
    }

    override fun buildPrice() {
        product.setPrice(20)
    }

    override fun getProduce(): Product = product


}