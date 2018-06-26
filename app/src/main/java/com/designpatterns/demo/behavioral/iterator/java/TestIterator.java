package com.designpatterns.demo.behavioral.iterator.java;

/**
 *
 * 迭代模式测试
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/26 下午3:18
 * @project_name DesignPatternsDemo
 */
public class TestIterator {

    public static void main(String[] args) {

        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("111");
        aggregate.add("222");
        aggregate.add("333");
        aggregate.add("444");
        aggregate.add("555");


        Iterator iterator=aggregate.iterator();
        while (iterator.hasNext()){
            String tel= (String) iterator.next();
            System.out.println("当前号码为："+tel);
        }
        System.out.println("没有号码");
    }

}
