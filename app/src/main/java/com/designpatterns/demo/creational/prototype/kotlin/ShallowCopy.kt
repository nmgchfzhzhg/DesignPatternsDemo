package com.designpatterns.demo.creational.prototype.kotlin


/**
 * 原型模式 浅拷贝 java转Kotlin
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/23 下午8:39
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
class ShallowCopy constructor(name: String) : Cloneable {
    var age: Int? = null
    var sex: String? = null
    var workExperience: WorkExperience
    var name:String?=null

    init {
        this.name=name
        workExperience = WorkExperience()
    }


    fun setPersonal(sex: String, age: Int) {
        this.sex = sex
        this.age = age
    }

    fun setWork(timeArea: String, company: String) {
        workExperience.timeArea = timeArea
        workExperience.company = company
    }

    //重写clone()方法为public类型，并调用Object类的本地clone()方法
    @Throws(CloneNotSupportedException::class)
    public override fun clone(): ShallowCopy {
        return super.clone() as ShallowCopy
    }

    fun display() {
        println("姓名：" + this.name)
        println("姓别：" + this.sex)
        println("年龄：" + this.age!!)
        println("工作时间：" + this.workExperience.timeArea)
        println("工作公司：" + this.workExperience.company)
    }

}
