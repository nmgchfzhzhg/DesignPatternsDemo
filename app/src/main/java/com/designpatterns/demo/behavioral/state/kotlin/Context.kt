package com.designpatterns.demo.behavioral.state.kotlin


/**
 * 封装类，环境角色
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/6/1 下午2:07
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class Context {
    companion object {
        val openningState = OpenningState()

        val closingState = ClosingState()

        val runningState = RunningState()

        val stoppingState = StoppingState()
    }

    private lateinit var liftState: LiftState

    fun getLiftState() = liftState

    fun setLiftState(liftState: LiftState) {
        this.liftState = liftState
        this.liftState.setContext(this)
    }

    fun open() = liftState.open()


    fun close() = liftState.close()

    fun run() = liftState.run()

    fun stop() = liftState.stop()
}