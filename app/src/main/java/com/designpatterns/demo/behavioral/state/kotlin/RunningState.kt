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
class RunningState:LiftState(){
    override fun open() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun run()= println("电梯运行状态")

    override fun stop() {
        super.mContext.setLiftState(Context.stoppingState)
        super.mContext.getLiftState().stop()
    }

}