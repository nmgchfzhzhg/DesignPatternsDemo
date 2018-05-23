package com.designpatterns.demo.creational.singleton.java;

/**
 * 单例模式 枚举式
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 下午2:34
 * @project_name DesignPatternsDemo
 */
public class EnumTypeSingleton {

    //    私有化构造函数
    private EnumTypeSingleton() {

    }

    //    提供外部访问方法
    public static EnumTypeSingleton getEnumTypeSingleton() {
        return Singleton.INSTANCE.getEnumTypeSingleton();
    }

    //    创建枚举类型
    private static enum Singleton {
        INSTANCE;
        private EnumTypeSingleton enumTypeSingleton;

        //  JVM会保证此方法据对只调用一次
        Singleton() {
            enumTypeSingleton = new EnumTypeSingleton();
        }

        public EnumTypeSingleton getEnumTypeSingleton() {
            return enumTypeSingleton;
        }
    }

}
