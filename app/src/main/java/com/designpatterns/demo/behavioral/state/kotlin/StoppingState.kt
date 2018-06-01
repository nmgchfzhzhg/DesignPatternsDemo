package com.designpatterns.demo.behavioral.state.kotlin

/**
 * 电梯在当前状态下能做的事情
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/1 下午2:08
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class StoppingState:LiftState(){
    override fun open() {
        super.mContext.setLiftState(Context.openningState)
        super.mContext.getLiftState().open()
    }


    override fun close(){}
    override fun run() {
        super.mContext.setLiftState(Context.runningState)
        super.mContext.getLiftState().run()
    }

    override fun stop() = println("电梯停止状态")

}