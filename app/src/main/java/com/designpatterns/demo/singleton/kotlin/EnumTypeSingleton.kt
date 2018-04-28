package com.designpatterns.demo.singleton.kotlin


/**
 * 单例模式 枚举式
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/27 上午10:05
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class EnumTypeSingleton private constructor(){


    //    java转Kotlin
    val enumTypeSingleton: EnumTypeSingleton
        get() = Singleton.INSTANCE.enumTypeSingleton

    private enum class Singleton
    private constructor() {
        INSTANCE;

        val enumTypeSingleton: EnumTypeSingleton

        init {
            enumTypeSingleton =EnumTypeSingleton()
        }
    }



}