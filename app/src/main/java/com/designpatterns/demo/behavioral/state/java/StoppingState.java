package com.designpatterns.demo.behavioral.state.java;

/**
 * 电梯在当前状态下能做的事情
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/1 上午11:40
 * @project_name DesignPatternsDemo
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.mContext.setLiftState(Context.openningState);
        super.mContext.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.mContext.setLiftState(Context.runningState);
        super.mContext.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
