package com.designpatterns.demo.behavioral.memento.java;

/**
 * 测试备忘录方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/7/19 上午11:52
 * @project_name DesignPatternsDemo
 */
public class TestMemento {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
//    改变负责人对象的状态
        originator.setState("On");
//        创建备忘录对象，并将发起人对象的状态存储起来
        caretaker.saveMemento(originator.createMemento());
//        修改发起人的状态
        originator.setState("Off");
//        恢复发起人对象的状态
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
    }
}
