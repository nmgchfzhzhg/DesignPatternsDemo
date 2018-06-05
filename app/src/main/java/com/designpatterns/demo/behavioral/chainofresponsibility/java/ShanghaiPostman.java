package com.designpatterns.demo.behavioral.chainofresponsibility.java;

/**
 * 实现抽象者处理类 上海快递员
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/5 上午11:59
 * @project_name DesignPatternsDemo
 */
public class ShanghaiPostman extends Postman {
    @Override
    public void handleCourier(String adress) {
        if(adress.equals("Shanghai")){
            System.out.println("派送到上海");
            return;
        }else{
            nextPostman.handleCourier(adress);
        }
    }
}
