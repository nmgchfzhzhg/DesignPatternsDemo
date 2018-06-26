package com.designpatterns.demo.behavioral.iterator.kotlin

/**
 *
 * 创建迭代器接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:23
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
interface Iterator{

    fun hasNext():Boolean

    fun next():Any

}