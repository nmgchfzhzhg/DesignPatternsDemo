package com.designpatterns.demo.creational.singleton.kotlin

import java.util.HashMap

/**
 * 单例模式 使用容器实现单例模式
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/27 上午9:58
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ContainerSingleton private constructor() {


    //Kotlin写法
    companion object {
        private lateinit var objMap: HashMap<String, Any>

        fun registerService1(key: String, instance: Any) {
            if (objMap.containsKey(key)) {
                objMap[key] = instance
            }
        }

        fun getService(key: String): Any {
            return objMap[key]!!
        }


    }


    //java转Kotlin
    private val objMap = HashMap<String, Any>()

    fun registerService(key: String, instance: Any) {
        if (objMap.containsKey(key)) {
            //  添加单例模式
            objMap[key] = instance
        }

    }

    //   获取单例
    fun getService(key: String): Any {
        return objMap[key]!!
    }
}