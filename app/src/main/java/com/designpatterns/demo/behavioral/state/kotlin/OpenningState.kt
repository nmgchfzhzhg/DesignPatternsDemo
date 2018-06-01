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
class OpenningState: LiftState() {


    override fun open() = println("电梯门开启状态")

    override fun close() {
        super.mContext.setLiftState(Context.closingState)
        super.mContext.getLiftState().close()
    }

    override fun run() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}