package com.designpatterns.demo.behavioral.chainofresponsibility.java;

/**
 * 实现抽象处理者类 北京快递员
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/5 上午11:57
 * @project_name DesignPatternsDemo
 */
public class BeijingPostman extends Postman {
    @Override
    public void handleCourier(String adress) {
        if(adress.equals("Beijing")){
            System.out.println("派送到北京");
            return;
        }else{
            nextPostman.handleCourier(adress);
        }
    }
}
