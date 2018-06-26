package com.designpatterns.demo.behavioral.iterator.java;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建具体容器类 实现容器接口中的功能
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:15
 * @project_name DesignPatternsDemo
 */
public class ConcreteAggregate implements Aggregate {

    private List<String> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String get(int location) {
        return list.get(location);
    }

    @Override
    public void add(String tel) {
        list.add(tel);
    }

    @Override
    public void remove(String tel) {
        list.remove(tel);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}
