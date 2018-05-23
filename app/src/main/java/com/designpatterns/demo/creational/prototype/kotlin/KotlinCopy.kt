package com.designpatterns.demo.creational.prototype.kotlin

/**
 * Kotlin data class
 *
 * @author  zhangzhiguo
 * @email: 810903987@qq.com
 * @date 2018/5/23 下午9:27
 * @project_name DesignPatternsDemo
 * @version 1.0.0
 *
 */
data class KotlinCopy(var name: String,var age: Int,var sex: String,var workExperience: WorkExperience){
    fun display() {
        println("姓名：" + this.name)
        println("姓别：" + this.sex)
        println("年龄：" + this.age!!)
        println("工作时间：" + this.workExperience.timeArea)
        println("工作公司：" + this.workExperience.company)
    }
}