package com.designpatterns.demo.singleton.java;

/**
 * 单例模式 懒汉式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午11:12
 * @project_name DesignPatternsDemo
 */
public class LazySingleton {
    //私有化构造函数
    private LazySingleton() {

    }

    //    创建私有对象
    private static LazySingleton lazySingleton;

    //    提供对外获取方法
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
