package com.designpatterns.demo.behavioral.observer.kotlin



/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午2:48
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
    val postman = Postman()
    val boy1 = Boy("lufei")
    val boy2 = Boy("1iaoba")
    val girl = Girl("meimei")

    postman.add(boy1)
    postman.add(boy2)
    postman.add(girl)

    postman.notify("快递到了，下楼取快递")

}