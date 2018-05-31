package com.designpatterns.demo.behavioral.strategy.java;

/**
 * 高级会员折扣类 具体策略实现，封装了算法的实现
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午1:01
 * @project_name DesignPatternsDemo
 */
public class AdvancedMember implements Member {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员的折扣为20%");
        return booksPrice*0.8;
    }
}
