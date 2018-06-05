package com.designpatterns.demo.behavioral.chainofresponsibility.kotlin

/**
 * 现抽象处理者类 广州快递员
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午2:18
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class GuangzhouPostman:Postman(){
    override fun handleCourier(adress: String) {
        when (adress) {
            "Guangzhou"-> println("派送到广州")
            else ->
                nextPostman!!.handleCourier(adress)
        }
    }
}