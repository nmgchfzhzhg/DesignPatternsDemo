package com.designpatterns.demo.java.singleton;

/**
 * 单例模式 同步锁式 懒加载的方式上升级，保证线程安全
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午11:32
 * @project_name DesignPatternsDemo
 */
public class SynchronizationLockSingleton {

    //    私有化构造函数
    private SynchronizationLockSingleton() {

    }

    //    创建私有对象
    private static SynchronizationLockSingleton synchronizationLockSingleton;

    //提供对外访问的方法
    public static synchronized SynchronizationLockSingleton getSynchronizationLockSingleton() {
        if (synchronizationLockSingleton == null) {
            synchronizationLockSingleton = new SynchronizationLockSingleton();
        }

        return synchronizationLockSingleton;

    }

}
