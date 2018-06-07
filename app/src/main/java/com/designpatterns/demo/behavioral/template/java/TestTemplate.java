package com.designpatterns.demo.behavioral.template.java;

/**
 * 测试模板方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/7 上午11:43
 * @project_name DesignPatternsDemo
 */
public class TestTemplate {
    public static void main(String[] args) {
        Account account=new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为："+account.calculateInterest());

        account=new CDAccount();
        System.out.println("定期账号的利息数额为："+account.calculateInterest());

    }

}
