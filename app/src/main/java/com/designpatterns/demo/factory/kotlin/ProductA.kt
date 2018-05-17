package com.designpatterns.demo.factory.kotlin

/**
 * 创建具体产品类（集成抽象产品类），定义生产的具体产品
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午3:09
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ProductA : Product() {

    override fun Show() = println("生产产品A")

}