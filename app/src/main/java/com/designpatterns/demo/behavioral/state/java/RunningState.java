package com.designpatterns.demo.behavioral.state.java;

/**
 * 电梯在当前状态下能做的事情
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/1 上午11:39
 * @project_name DesignPatternsDemo
 */
public class RunningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行");

    }

    @Override
    public void stop() {
//        设置电梯状态
        super.mContext.setLiftState(Context.stoppingState);
        super.mContext.getLiftState().stop();

    }
}
