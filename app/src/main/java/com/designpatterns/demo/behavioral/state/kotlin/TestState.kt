package com.designpatterns.demo.behavioral.state.kotlin


/**
 *
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/1 下午2:37
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {

    val context = Context()

    context.setLiftState(ClosingState())

    context.run()
    context.stop()
    context.open()
    context.close()
}