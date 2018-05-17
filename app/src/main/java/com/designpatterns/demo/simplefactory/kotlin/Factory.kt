package com.designpatterns.demo.simplefactory.kotlin


/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/15 下午4:36
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */

class Factory {

    fun Manufacture(productName: String): Product? {
        when (productName) {
            "A" -> return ProductA()
            "B" -> return ProductB()
            else -> return null
        }
    }

}