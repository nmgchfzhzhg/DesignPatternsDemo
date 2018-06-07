package com.designpatterns.demo.behavioral.template.java;

/**
 * 具体模板角色类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/7 上午11:42
 * @project_name DesignPatternsDemo
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
