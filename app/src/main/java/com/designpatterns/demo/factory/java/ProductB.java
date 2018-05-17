package com.designpatterns.demo.factory.java;

/**
 * 创建具体产品类（集成抽象产品类），定义生产的具体产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/17 下午2:12
 * @project_name DesignPatternsDemo
 */
public class ProductB extends Product {
    @Override
    public void show() {
        System.out.println("生产产品B");
    }
}
