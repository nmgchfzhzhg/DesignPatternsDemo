package com.designpatterns.demo.creational.singleton.kotlin

/**
 * 单例模式 同步锁式 懒加载的方式上升级，保证线程安全
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午11:32
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class SynchronizationLockSingleton private constructor() {


    companion object {
        private var synchronizationLockSingleton: SynchronizationLockSingleton? = null

        //Kotlin通过注释的方式来加锁
        @Synchronized
        fun getSynchronizationLockSingleton(): SynchronizationLockSingleton {
            if (synchronizationLockSingleton == null) {
                synchronizationLockSingleton = SynchronizationLockSingleton()
            }
            return synchronizationLockSingleton!!
        }
    }

}