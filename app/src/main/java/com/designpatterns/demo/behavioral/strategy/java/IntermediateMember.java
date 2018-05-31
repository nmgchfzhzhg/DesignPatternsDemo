package com.designpatterns.demo.behavioral.strategy.java;

/**
 * 中级会员折扣类 具体策略实现，封装了算法的实现
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午1:00
 * @project_name DesignPatternsDemo
 */
public class IntermediateMember implements Member {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员折扣为10%");
        return booksPrice*0.9;
    }
}
