package com.designpatterns.demo.behavioral.iterator.java;

/**
 *
 * 创建具体迭代器类 实现迭代器接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:12
 * @project_name DesignPatternsDemo
 */
public class ConcreteIterator implements Iterator{

    private Aggregate aggregate;

    private int index;

    public ConcreteIterator(Aggregate aggregate){
        this.aggregate=aggregate;
    }
    @Override
    public boolean hasNext() {

        if(index<aggregate.size()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return aggregate.get(index++);
    }
}
