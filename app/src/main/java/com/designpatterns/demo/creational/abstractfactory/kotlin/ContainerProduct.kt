package com.designpatterns.demo.creational.abstractfactory.kotlin

/**
 * 创建抽象产品类，定义具体产品的公共接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/21 上午9:50
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class ContainerProduct: Product(){

    abstract override fun Show()

}