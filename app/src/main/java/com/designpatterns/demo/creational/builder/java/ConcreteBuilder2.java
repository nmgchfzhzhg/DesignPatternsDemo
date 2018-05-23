package com.designpatterns.demo.creational.builder.java;

/**
 *具体的创建者，实现创建方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:57
 * @project_name DesignPatternsDemo
 */
public class ConcreteBuilder2 extends Builder {

    private Product product;

    public ConcreteBuilder2() {
        this.product = new Product();
    }

    @Override
    public void buildName() {
        product.setName("套餐2");

    }

    @Override
    public void buildPrice() {
        product.setPrice(20);

    }

    @Override
    public Product getProduce() {
        return product;
    }
}
