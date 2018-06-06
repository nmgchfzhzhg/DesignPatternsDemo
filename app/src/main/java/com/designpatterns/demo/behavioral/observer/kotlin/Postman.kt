package com.designpatterns.demo.behavioral.observer.kotlin


/**
 * 创建具体观察者
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午2:48
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Postman:Observable{

    val personList = ArrayList<Observer>()

    override fun add(observer: Observer) {
        personList.add(observer)
    }

    override fun remove(observer: Observer) {
        personList.remove(observer)
    }

    override fun notify(message: String) {
        for (observer in personList) {
            observer.update(message)
        }

    }


}