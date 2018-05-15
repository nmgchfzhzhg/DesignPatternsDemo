package com.designpatterns.demo.builder.java;

/**
 * 产品类，创建产品角色
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/10 下午4:46
 * @project_name DesignPatternsDemo
 */
class Product {

    private String name;

    private int price;

    public void show(){
        System.out.println("名字："+name+",价格："+price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
