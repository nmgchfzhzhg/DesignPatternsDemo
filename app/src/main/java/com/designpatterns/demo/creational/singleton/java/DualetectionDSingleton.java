package com.designpatterns.demo.creational.singleton.java;

/**
 * 单例模式 双重检测式（DCL），解决懒加载和同步锁的缺点
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 下午1:33
 * @project_name DesignPatternsDemo
 */
public class DualetectionDSingleton {

    //    私有化构造函数
    private DualetectionDSingleton() {

    }

    /**
     * volatile 关键字
     *
     * 1）保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     * 2）禁止进行指令重排序。
     */

    //创建静态对象
    private static volatile DualetectionDSingleton dualetectionDSingleton;

    //    对外公开回去方法
    public static DualetectionDSingleton getDualetectionDSingleton() {
        if (dualetectionDSingleton == null) {
            synchronized (DualetectionDSingleton.class) {
                if (dualetectionDSingleton == null) {
                    dualetectionDSingleton = new DualetectionDSingleton();
                }
            }
        }
        return dualetectionDSingleton;
    }

}
