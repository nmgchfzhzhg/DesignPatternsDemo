package com.designpatterns.demo.behavioral.observer.java;

/**
 * 具体的观察者
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/6 上午11:31
 * @project_name DesignPatternsDemo
 */
public class Boy implements Observer {

    private String name;

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"收到信息，"+message+"去取快递");
    }
}
