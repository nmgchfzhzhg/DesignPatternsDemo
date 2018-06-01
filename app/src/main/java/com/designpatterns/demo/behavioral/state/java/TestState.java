package com.designpatterns.demo.behavioral.state.java;

/**
 * 测试状态模式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/1 上午11:55
 * @project_name DesignPatternsDemo
 */
public class TestState {
    public static void main(String[] args) {
        Context context=new Context();
        context.setLiftState(new ClosingState());

        context.run();
        context.stop();
        context.open();
        context.close();



    }
}
