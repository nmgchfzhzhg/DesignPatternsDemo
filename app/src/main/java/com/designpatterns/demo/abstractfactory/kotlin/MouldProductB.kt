package com.designpatterns.demo.abstractfactory.kotlin

/**
 * 创建具体产品类（集成抽象产品类），定义生成的具体产品
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/21 上午10:02
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class MouldProductB:MouldProduct(){

    override fun Show() {
        println("生成出模具产品B")
    }

}