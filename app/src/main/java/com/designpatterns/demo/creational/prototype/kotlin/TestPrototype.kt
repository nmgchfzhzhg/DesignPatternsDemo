package com.designpatterns.demo.creational.prototype.kotlin


/**
 * 测试原型模式浅拷贝与深拷贝
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/23 下午8:40
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
fun main(args: Array<String>) {
//        浅拷贝
    val shallowCopy1 = ShallowCopy("zhangsan")
    shallowCopy1.setPersonal("man", 20)
    shallowCopy1.setWork("2016/08/13-2018/08/08", "xiaomi")

    val shallowCopy2 = shallowCopy1.clone()
    shallowCopy2.name = "lisi"
    shallowCopy2.setPersonal("woman", 30)
    shallowCopy2.setWork("2014/10/13-2016/08/08", "huawei")

    shallowCopy1.display()
    shallowCopy2.display()
//        深拷贝
    val deepCopy1 = DeepCopy("zhangsan")
    deepCopy1.setPersonal("man", 20)
    deepCopy1.setWork("2016/08/13-2018/08/08", "xiaomi")

    val deepCopy2 = deepCopy1.clone()
    deepCopy2.name = "lisi"
    deepCopy2.setPersonal("woman", 30)
    deepCopy2.setWork("2014/10/13-2016/08/08", "huawei")

    deepCopy1.display()
    deepCopy2.display()

//      Kotlin 用数据类（data classes）实现
//      当使用数据类的时候，我们将免费得到 equals、hashCode、toString 和 copy 这几个函数。
//      通过 copy，我们可以复制一整个对象并且修改所得到的新对象的一些属性。
    var workExperience = WorkExperience()
    workExperience.timeArea = "2014"
    workExperience.company = "chuizi"
    val kotlinCopy1 = KotlinCopy("wangwu", 31, "man", workExperience)
    val kotlinCopy2 = kotlinCopy1.copy()
    kotlinCopy2.name = "wang"
    kotlinCopy2.age = 18
    kotlinCopy2.sex = "woman"
    kotlinCopy1.display()
    kotlinCopy2.display()


}