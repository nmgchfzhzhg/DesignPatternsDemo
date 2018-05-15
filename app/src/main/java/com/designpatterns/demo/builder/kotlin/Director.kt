package com.designpatterns.demo.builder.kotlin


/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 上午9:46
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Director{


    private var builder: Builder? = null

    fun setBuilder(builder: Builder) {
        this.builder = builder
    }

    fun construct(): Product? {
        builder!!.buildName()
        builder!!.buildPrice()

        return builder!!.getProduce()
    }

}