package com.designpatterns.demo.simplefactory.java;

/**
 * 创建具体的产品类（继承抽象产品类），定义具体的产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/15 下午3:57
 * @project_name DesignPatternsDemo
 */
public class ProductB extends Product {
    @Override
    public void Show() {
        System.out.println("生产产品B");
    }
}
