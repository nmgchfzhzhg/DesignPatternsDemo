package com.designpatterns.demo.behavioral.iterator.java;

/**
 *
 * 创建容器接口 定义容器的基本功能以及提供创建迭代器接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:09
 * @project_name DesignPatternsDemo
 */
public interface Aggregate {

    int size();

    String get(int location);

    void add(String tel);

    void remove(String tel);

    Iterator iterator();

}
