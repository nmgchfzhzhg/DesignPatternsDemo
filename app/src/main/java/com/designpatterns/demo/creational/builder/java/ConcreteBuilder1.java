package com.designpatterns.demo.creational.builder.java;

/**
 * 具体的创建者，实现创建方法
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:54
 * @project_name DesignPatternsDemo
 */
public class ConcreteBuilder1 extends Builder {

    private Product product;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    @Override
    public void buildName() {
        product.setName("套餐1");
    }

    @Override
    public void buildPrice() {
        product.setPrice(10);

    }

    @Override
    public Product getProduce() {
        return product;
    }
}
