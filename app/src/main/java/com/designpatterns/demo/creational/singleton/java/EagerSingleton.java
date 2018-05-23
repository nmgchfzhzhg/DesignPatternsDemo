package com.designpatterns.demo.creational.singleton.java;

/**
 * 单例模式 饿汉式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午10:07
 * @project_name DesignPatternsDemo
 */
public class EagerSingleton {
    //    私有化构造函数
    private EagerSingleton() {
    }

    //    私有化静态对象
    private static EagerSingleton baseSingleton = new EagerSingleton();

    //    提供对外获取方法
    public static EagerSingleton getBaseSingleton() {
        return baseSingleton;
    }
}
