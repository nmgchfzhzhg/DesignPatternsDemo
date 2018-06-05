package com.designpatterns.demo.behavioral.chainofresponsibility.java;

/**
 * 测试责任链模式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/5 下午12:01
 * @project_name DesignPatternsDemo
 */
public class TestChainOfResponsibility {

    public static void main(String[] args) {
        Postman beijingPostman = new BeijingPostman();
        Postman shanghaiPostman = new ShanghaiPostman();
        Postman guangzhouPostman = new GuangzhouPostman();

        beijingPostman.nextPostman=shanghaiPostman;
        shanghaiPostman.nextPostman=guangzhouPostman;

        System.out.println("有一个上海快递需要派送");
        beijingPostman.handleCourier("Shanghai");
        beijingPostman.handleCourier("Guangzhou");
        System.out.println("有一个美国快递需要派送:");
        beijingPostman.handleCourier("America");
    }

}
