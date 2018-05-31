package com.designpatterns.demo.behavioral.strategy.java;

/**
 * 价钱类 用来操作策略的上下文环境
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午1:03
 * @project_name DesignPatternsDemo
 */
public class Price {
    private Member member;

    public Price(Member member) {
        this.member = member;
    }

    public double quote(double booksPrice){
        return this.member.calcPrice(booksPrice);
    }
}
