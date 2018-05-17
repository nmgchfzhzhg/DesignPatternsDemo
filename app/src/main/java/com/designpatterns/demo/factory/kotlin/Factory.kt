package com.designpatterns.demo.factory.kotlin

/**
 * 创建抽象工厂类，定义具体工厂的公共接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午3:08
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class Factory{
    abstract fun Manufacture():Product
}