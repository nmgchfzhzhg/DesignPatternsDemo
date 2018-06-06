package com.designpatterns.demo.behavioral.observer.kotlin

/**
 * 抽象观察者
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午2:40
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
interface Observer {
    fun update(message: String)
}