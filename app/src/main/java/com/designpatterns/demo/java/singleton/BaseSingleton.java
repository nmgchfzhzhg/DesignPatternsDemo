package com.designpatterns.demo.java.singleton;

/**
 * 单例模式饿汉式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午10:07
 * @project_name DesignPatternsDemo
 */
public class BaseSingleton {
    //    私有化构造函数
    private BaseSingleton() {
    }

    //    私有化静态对象
    private static BaseSingleton baseSingleton = new BaseSingleton();

    //    提供对外获取方法
    public static BaseSingleton getBaseSingleton() {
        return baseSingleton;
    }
}
