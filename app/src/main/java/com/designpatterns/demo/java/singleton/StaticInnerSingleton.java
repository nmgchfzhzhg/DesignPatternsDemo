package com.designpatterns.demo.java.singleton;

/**
 * 单例模式 静态内部类式（推荐使用模式）
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 下午2:07
 * @project_name DesignPatternsDemo
 */
public class StaticInnerSingleton {

    //  私有化构造函数
    private StaticInnerSingleton() {

    }

    //  创建静态内部类
    private static class Inner {
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }

    //  提供对外访问的方法
    public static StaticInnerSingleton getStaticInnerSingleton() {
        return Inner.staticInnerSingleton;
    }

}
