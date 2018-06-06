package com.designpatterns.demo.behavioral.observer.kotlin


/**
 * 抽象被观察者
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午2:46
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
interface Observable{
     fun add(observer: Observer)

     fun remove(observer: Observer)

     fun notify(message: String)
}