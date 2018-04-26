package com.designpatterns.demo.kotlin.singleton

/**
 * 单例模式 懒汉式
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/26 上午11:12
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class LazySingleton private constructor() {


    companion object {
        //原生写法
        //LazyThreadSafetyMode.NONE 线程不安全
        val lazySingleton by lazy(LazyThreadSafetyMode.NONE) {
            LazySingleton()
        }
    }



    //翻译JAVA的写法
    private var lazySingleton1: LazySingleton? = null

    fun getLazySingleton(): LazySingleton {
        if (lazySingleton1 == null) {
            lazySingleton1 = LazySingleton()
        }

//        空判断
//        Kotlin的空安全设计对于声明可为空的参数，
//        在使用时要进行空判断处理，有两种处理方式一种像Java一样抛出空异常，字段后加!!，另一种不做处理直接跳过，字段后加?
        return lazySingleton1!!
    }
}