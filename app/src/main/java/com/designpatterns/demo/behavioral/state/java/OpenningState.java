package com.designpatterns.demo.behavioral.state.java;

/**
 * 电梯在当前状态下能做的事情
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/1 上午11:36
 * @project_name DesignPatternsDemo
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门打开");
    }

    @Override
    public void close() {
//状态修改
        super.mContext.setLiftState(Context.closeingState);
//动作委托为CloseState来执行
        super.mContext.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
