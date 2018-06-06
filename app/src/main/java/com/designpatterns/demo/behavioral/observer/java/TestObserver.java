package com.designpatterns.demo.behavioral.observer.java;

/**
 *
 *
 * @author zhangzhiguo
 * @version 1.0.0
 * @email: 810903987@qq.com
 * @date 2018/6/6 下午1:19
 * @project_name DesignPatternsDemo
 */
public class TestObserver {

    public static void main(String[] args) {
        Observable postman=new Postman();
        Observer boy1=new Boy("lufei");
        Observer boy2=new Boy("1iaoba");
        Observer girl=new Girl("meimei");

        postman.add(boy1);
        postman.add(boy2);
        postman.add(girl);

        postman.notify("快递到了，下楼取快递");

    }

}
