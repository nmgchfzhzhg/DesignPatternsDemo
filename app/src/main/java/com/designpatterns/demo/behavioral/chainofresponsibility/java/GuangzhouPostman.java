package com.designpatterns.demo.behavioral.chainofresponsibility.java;

/**
 * 实现抽象者处理类 广州快递员
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午12:00
 * @project_name DesignPatternsDemo
 */
public class GuangzhouPostman extends Postman {
    @Override
    public void handleCourier(String adress) {
        if(adress.equals("Guangzhou")){
            System.out.println("派送到广州");
            return;
        }else{
            if(nextPostman!=null)
            nextPostman.handleCourier(adress);
        }
    }
}
