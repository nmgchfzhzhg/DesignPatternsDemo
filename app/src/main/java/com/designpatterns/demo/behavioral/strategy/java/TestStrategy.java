package com.designpatterns.demo.behavioral.strategy.java;

/**
 * 测试策略模式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/25 上午1:05
 * @project_name DesignPatternsDemo
 */
public class TestStrategy {
    public static void main(String[] args){
        Member member=new AdvancedMember();
        Price price=new Price(member);
        double quote=price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
