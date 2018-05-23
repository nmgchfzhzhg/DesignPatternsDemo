package com.designpatterns.demo.creational.singleton.kotlin


/**
 * 单例模式 双重检测式（DCL），解决懒加载和同步锁的缺点
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/4/26 下午1:33
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class DualetectionDSingleton private constructor() {
    companion object {
        //        Kotlin原生写法
        val dualetectionDSingleton by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DualetectionDSingleton()
        }

        //        翻译java代码写法
        @Volatile
        private var dualetectionDSingleton1: DualetectionDSingleton? = null

        fun getDualetectionDSingleton1(): DualetectionDSingleton {
            if (dualetectionDSingleton1 == null) {
                synchronized(DualetectionDSingleton::class) {
                    if (dualetectionDSingleton1 == null) {
                        dualetectionDSingleton1 = DualetectionDSingleton()
                    }
                }
            }
            return dualetectionDSingleton1!!
        }
    }
}
