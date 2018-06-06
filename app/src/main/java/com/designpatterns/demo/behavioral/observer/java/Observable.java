package com.designpatterns.demo.behavioral.observer.java;

/**
 * 抽象被观察者
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/6 上午11:35
 * @project_name DesignPatternsDemo
 */
public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notify(String message);
}
