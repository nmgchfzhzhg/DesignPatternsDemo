package com.designpatterns.demo.abstractfactory.java;

/**
 * 创建具体产品类（集成抽象产品类），定义生成的具体产品
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/18 下午1:44
 * @project_name DesignPatternsDemo
 */
public class MouldProductA extends MouldProduct {
    @Override
    public void Show() {
        System.out.println("生成出模具产品A");
    }
}
