package com.designpatterns.demo.behavioral.chainofresponsibility.kotlin

/**
 * 现抽象处理者类 上海快递员
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午2:18
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ShanghaiPostman: Postman() {
    override fun handleCourier(adress: String) {
        when (adress) {
            "Shanghai"-> println("派送到上海")
            else ->
                nextPostman!!.handleCourier(adress)
        }
    }
}