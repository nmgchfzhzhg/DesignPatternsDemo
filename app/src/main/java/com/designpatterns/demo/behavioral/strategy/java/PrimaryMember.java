package com.designpatterns.demo.behavioral.strategy.java;


/**
 * 初级会员折扣类 具体策略实现，封装了算法的实现
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午12:58
 * @project_name DesignPatternsDemo
 */
public class PrimaryMember implements Member {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有折扣");
        return booksPrice;
    }
}
