package com.designpatterns.demo.creational.simplefactory.java;

/**
 * 通过反射方式实现工厂类
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/17 上午10:52
 * @project_name DesignPatternsDemo
 */
public class CreateFactory {
    public static <T extends Product> T CreateFactory(Class<T> cls) {
        Product product = null;

        try {
            //        反射出实例
            product = (Product) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
