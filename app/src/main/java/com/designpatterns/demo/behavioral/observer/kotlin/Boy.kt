package com.designpatterns.demo.behavioral.observer.kotlin

/**
 * 具体的观察者
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午2:41
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Boy(val name:String): Observer {


    override fun update(message: String) =println(name + "收到信息，" + message + "去取快递")

}