package com.designpatterns.demo.behavioral.strategy.java;

/**
 * 抽象折扣类 提供具体策略类需要实现的接口
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午12:57
 * @project_name DesignPatternsDemo
 */
public interface Member {

    public double calcPrice(double booksPrice);

}
