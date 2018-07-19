package com.designpatterns.demo.behavioral.memento.java;

/**
 * 发起人角色类 发起人角色利用一个新创建的备忘录对象将自己的内部状态存储起来
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/27 下午4:37
 * @project_name DesignPatternsDemo
 */
public class Originator {

    private String state;


    /**
     * 工厂方法，返回一个新的备忘录对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人回复到备忘录对象所记载的状态
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;

    }

}
