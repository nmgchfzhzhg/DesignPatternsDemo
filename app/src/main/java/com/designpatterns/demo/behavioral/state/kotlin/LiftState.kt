package com.designpatterns.demo.behavioral.state.kotlin


/**
 * 定义个电梯抽象类，每个状态下四个方法，各个状态下的实现方法不同
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/1 下午1:41
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
abstract class LiftState{

    protected lateinit var mContext: Context

    fun setContext(context: Context){
        this.mContext=context
    }

    abstract fun open()

    abstract fun close()

    abstract fun run()

    abstract fun stop()

}