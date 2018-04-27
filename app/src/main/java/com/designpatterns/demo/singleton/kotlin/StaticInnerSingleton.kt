package com.designpatterns.demo.singleton.kotlin

/**
 * 单例模式 静态内部类式（推荐使用模式）
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/26 下午2:07
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class StaticInnerSingleton private constructor() {

    companion object {
        fun getStaticInnerSingleton() = Inner.staticInnerSingleton
    }

    private object Inner {
        val staticInnerSingleton = StaticInnerSingleton
    }

}