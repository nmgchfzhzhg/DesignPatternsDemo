package com.designpatterns.demo.behavioral.chainofresponsibility.kotlin

/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午1:52
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class Postman{

    var nextPostman:Postman?=null

    abstract fun handleCourier(adress:String)


}