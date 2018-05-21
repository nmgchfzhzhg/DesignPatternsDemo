package com.designpatterns.demo.abstractfactory.kotlin

/**
 * 创建具体工厂（继承抽象工厂类），定义创建对应具体产品实例的方法
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/21 上午10:09
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class FactoryB:Factory(){

    override fun ManufactureContainer(): Product = ContainerProductB()

    override fun ManufactureMould(): Product=MouldProductB()

}