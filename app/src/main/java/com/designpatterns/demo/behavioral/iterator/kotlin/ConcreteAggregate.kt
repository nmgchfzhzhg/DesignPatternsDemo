package com.designpatterns.demo.behavioral.iterator.kotlin


/**
 *
 * 创建具体容器类 实现容器接口中的功能
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:38
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ConcreteAggregate:Aggregate {

    var list=ArrayList<String>()

    override fun size(): Int=list.size

    override fun get(location: Int): String =list[location]

    override fun add(tel: String) {
        list.add(tel)
    }

    override fun remove(tel: String) {
        list.remove(tel)
    }

    override fun iterator(): Iterator {
        return ConcreteIterator(this)
    }
}