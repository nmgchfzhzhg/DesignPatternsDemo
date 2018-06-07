package com.designpatterns.demo.behavioral.template.java;

/**
 * 抽象模板角色类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/7 上午11:32
 * @project_name DesignPatternsDemo
 */
public abstract class Account {


    //    模板方法，申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序计算利息数额，返回利息数额
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;

    }

    //基本方法，留给子类实现
    protected abstract String doCalculateAccountType();

    //    基本方法，留给子类实现
    protected abstract double doCalculateInterestRate();

    protected double calculateAmount(String accountType) {
        return 7222.00;
    }

}
