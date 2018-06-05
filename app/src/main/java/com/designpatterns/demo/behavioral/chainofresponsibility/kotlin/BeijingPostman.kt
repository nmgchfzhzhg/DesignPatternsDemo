package com.designpatterns.demo.behavioral.chainofresponsibility.kotlin

/**
 * 现抽象处理者类 北京快递员
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午2:12
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class BeijingPostman : Postman() {
    override fun handleCourier(adress: String) {
        when (adress) {
            "Beijing"-> println("派送到北京")
            else ->
                    nextPostman!!.handleCourier(adress)
        }
    }

}