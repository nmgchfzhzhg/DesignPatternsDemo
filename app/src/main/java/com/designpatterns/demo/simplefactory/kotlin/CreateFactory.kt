package com.designpatterns.demo.simplefactory.kotlin


/**
 * 通过反射方式实现工厂类
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/17 上午10:58
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class CreateFactory {
//    java代码转换
    fun <T : Product> CreateFactory(cls: Class<T>): T? {
        var product: Product? = null

        try {
            //        反射出实例
            product = Class.forName(cls.name).newInstance() as Product
        } catch (e: InstantiationException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }

        return product as T?
    }
}
