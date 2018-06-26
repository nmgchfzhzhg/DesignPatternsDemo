package com.designpatterns.demo.behavioral.iterator.kotlin

/**
 *
 * 创建容器接口 定义容器的基本功能以及提供创建迭代器接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:27
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
interface Aggregate{

    fun size():Int

    fun get(location:Int):String

    fun add(tel:String)

    fun remove(tel:String)

    fun iterator():Iterator

}