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
public class ClosingState extends LiftState {
    @Override
    public void open() {
//设置电梯门为打开状态
        super.mContext.setLiftState(Context.openningState);
        super.mContext.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
//        设置电梯门运行状态
        super.mContext.setLiftState(Context.runningState);
        super.mContext.getLiftState().run();

    }

    @Override
    public void stop() {
// 设置电梯门停止状态
        super.mContext.setLiftState(Context.stoppingState);
        super.mContext.getLiftState().stop();
    }
}
