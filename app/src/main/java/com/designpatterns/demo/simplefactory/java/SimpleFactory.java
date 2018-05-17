package com.designpatterns.demo.simplefactory.java;

/**
 * 调用工厂类的静态方法，传入不同参数，创建不同产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/15 下午4:06
 * @project_name DesignPatternsDemo
 */
public class SimpleFactory {

    public static void main(String[] args){
        Factory factory=new Factory();
        factory.Manufacture("A").Show();
        factory.Manufacture("B").Show();

        CreateFactory createFactory=new CreateFactory();
        createFactory.CreateFactory(ProductA.class).Show();
        createFactory.CreateFactory(ProductB.class).Show();

    }
}
