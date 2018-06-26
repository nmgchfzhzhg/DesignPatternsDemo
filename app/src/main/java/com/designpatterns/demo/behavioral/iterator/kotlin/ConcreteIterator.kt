package com.designpatterns.demo.behavioral.iterator.kotlin

/**
 *
 * 创建具体迭代器类 实现迭代器接口
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:24
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ConcreteIterator(var aggregate: Aggregate) : Iterator {

    var index:Int=0

    override fun next(): Any=aggregate.get(index)

    override fun hasNext(): Boolean  =if (index < aggregate.size()) {true} else false

}