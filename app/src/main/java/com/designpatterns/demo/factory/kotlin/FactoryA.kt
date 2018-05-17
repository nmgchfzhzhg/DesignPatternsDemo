package com.designpatterns.demo.factory.kotlin

import com.designpatterns.demo.factory.java.Factory
import com.designpatterns.demo.factory.java.Product
import com.designpatterns.demo.factory.java.ProductA

/**
 * 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午3:11
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class FactoryA : Factory() {
    override fun Manufacture(): Product = ProductA()
}