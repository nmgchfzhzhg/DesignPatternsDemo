package com.designpatterns.demo.creational.prototype.java;

/**
 * 测试原型模式浅拷贝与深拷贝
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/23 上午11:14
 * @project_name DesignPatternsDemo
 */
public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

//        浅拷贝
        ShallowCopy shallowCopy1 = new ShallowCopy("zhangsan");
        shallowCopy1.setPersonal("man", 20);
        shallowCopy1.setWork("2016/08/13-2018/08/08", "xiaomi");

        ShallowCopy shallowCopy2 = shallowCopy1.clone();
        shallowCopy2.setName("lisi");
        shallowCopy2.setPersonal("woman", 30);
        shallowCopy2.setWork("2014/10/13-2016/08/08", "huawei");

        shallowCopy1.display();
        shallowCopy2.display();
//        深拷贝
        DeepCopy deepCopy1 = new DeepCopy("zhangsan");
        deepCopy1.setPersonal("man", 20);
        deepCopy1.setWork("2016/08/13-2018/08/08", "xiaomi");

        DeepCopy deepCopy2 = deepCopy1.clone();
        deepCopy2.setName("lisi");
        deepCopy2.setPersonal("woman", 30);
        deepCopy2.setWork("2014/10/13-2016/08/08", "huawei");

        deepCopy1.display();
        deepCopy2.display();
    }

}
