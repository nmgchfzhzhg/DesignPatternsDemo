package com.designpatterns.demo.behavioral.template.java;

/**
 * 具体模板角色类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/7 上午11:40
 * @project_name DesignPatternsDemo
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
