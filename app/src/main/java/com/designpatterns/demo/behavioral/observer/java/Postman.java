package com.designpatterns.demo.behavioral.observer.java;

import java.util.ArrayList;
import java.util.List;


/**
 * 创建具体观察者
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午1:13
 * @project_name DesignPatternsDemo
 */
public class Postman implements Observable {

    private List<Observer> personList=new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        personList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        personList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer:personList){
            observer.update(message);
        }
    }
}
