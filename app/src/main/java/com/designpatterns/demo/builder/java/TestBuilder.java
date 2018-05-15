package com.designpatterns.demo.builder.java;

/**
 * 测试类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:58
 * @project_name DesignPatternsDemo
 */
public class TestBuilder {

    public static void main(String[] args){
        System.out.println("建造者模式测试类");

        Product product;

        Director director=new Director();

        Builder builder1=new ConcreteBuilder1();
        director.setBuilder(builder1);
        product=director.construct();
        product.show();

        Builder builder2=new ConcreteBuilder2();
        director.setBuilder(builder2);
        product=director.construct();
        product.show();


    }

}
