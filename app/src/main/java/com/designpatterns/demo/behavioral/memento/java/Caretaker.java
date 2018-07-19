package com.designpatterns.demo.behavioral.memento.java;

/**
 * 负责人角色类，负责人角色负责保存备忘录对象，但是从不修改甚至不查看备忘录对象的内容
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/7/19 上午11:48
 * @project_name DesignPatternsDemo
 */
public class Caretaker {

    private Memento memento;

    /**
     * 备忘录取值方法
     *
     * @return
     */
    public Memento retrieveMemento() {
        return this.memento;
    }

    /**
     * 备忘录的赋值方法
     * @param memento
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

}
