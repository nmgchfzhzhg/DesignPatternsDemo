package com.designpatterns.demo.behavioral.memento.java;


/**
 *
 * 备忘录角色类 备忘录对象将发起人对象传入的状态存储起来
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/7/19 上午10:59
 * @project_name DesignPatternsDemo
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state=state;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
