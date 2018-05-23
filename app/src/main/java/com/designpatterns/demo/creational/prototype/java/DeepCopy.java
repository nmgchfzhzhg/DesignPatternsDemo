package com.designpatterns.demo.creational.prototype.java;

/**
 * 原型模式，深拷贝
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/5/23 上午11:10
 * @project_name DesignPatternsDemo
 */
public class DeepCopy implements Cloneable {
    public String name;
    public Integer age;
    public String sex;
    public WorkExperience workExperience;

    public DeepCopy(String name) {
        this.name = name;
        workExperience=new WorkExperience();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonal(String sex,int age){
        this.sex=sex;
        this.age=age;
    }
    public void setWork(String timeArea,String company){
        workExperience.timeArea=timeArea;
        workExperience.company=company;
    }

    //重写clone()方法为public类型，并调用Object类的本地clone()方法
    @Override
    public DeepCopy clone() throws CloneNotSupportedException {
        int age=this.age;
        String sex=this.sex;
        String name=this.name;
        DeepCopy deepCopy=new DeepCopy(name);
        deepCopy.setPersonal(sex,age);
        deepCopy.setWork(this.workExperience.timeArea,this.workExperience.company);
        return deepCopy;
    }

    public void display(){
        System.out.println("姓名："+this.name);
        System.out.println("姓别："+this.sex);
        System.out.println("年龄："+this.age);
        System.out.println("工作时间："+this.workExperience.timeArea);
        System.out.println("工作公司："+this.workExperience.company);
    }
}
