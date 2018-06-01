package com.designpatterns.demo.behavioral.state.java;

/**
 * 定义个电梯抽象类，每个状态下四个方法，各个状态下的实现方法不同
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/1 上午11:05
 * @project_name DesignPatternsDemo
 */
public abstract class LiftState {
//    定义一个环境角色，也就是封装状态的变换引起的功能变化
    protected Context mContext;

    public void setContext(Context context){
        this.mContext=context;
    }

//    首先电梯门开启状态
    public abstract void open();
//    电梯门关闭状态
    public abstract void close();
//    电梯运行状态
    public abstract void run();
//    电梯停止状态
    public abstract void stop();

}
