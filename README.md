# 设计模式学习

## 1、序言
最近在看设计模式之禅，Android开发同时也在学习Kotlin，网上搜了一下，用Kotlin代码写的设计模式资料很少，所以突发奇想，使用java、Kotlin语言同时实现设计模式，在学习过程中参考了很多博客，已经写在参考链接里了，学习注重总结，总结的目的是用来复习。
## 2、设计模式简介

* 对接口编程而不是对实现编程
* 优先使用对象组合而不是继承

## 3、设计模式分类
设计模式一般分为三类：创建型模式、结构型模式、行为型模式

<table>
  <tr>
    <th width=20%, bgcolor=yellow >模式</th>
    <th width=40%, bgcolor=yellow>描述</th>
    <th width="40%", bgcolor=yellow>包括</th>
  </tr>
  <tr>
    <td bgcolor=#eeeeee> 创建型模式 </td>
    <td> 这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。 </td>
    <td> 
        <ul>
            <li><div title="单例模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/singleton">单例模式（Singleton Pattern）</div></li> 
            <li><div title="工厂模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/factory">工厂模式（Factory Pattern）</div></li> 
            <li><div title="简单工厂模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/simplefactory">简单工厂模式（Factory Pattern）</div></li> 
            <li><div title="抽象工厂模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/abstractfactory">抽象工厂模式（Abstract Factory Pattern）</div></li> 
            <li><div title="建造者模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/builder">建造者模式（Builder Pattern）</div></li> 
            <li><div title="原型模式"><a href="https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/prototype">原型模式（Prototype Pattern）</div></li> 
         </ul>
     </td>
  </tr>
</table>

## 4、设计模式目的
降低对象之间的耦合，增加程序的可复用性，可扩展性，可维护性


* 创建型模式-->对象怎么来的
* 结构型模式-->对象和谁有关
* 行为型模式-->对象与对象在做什么




## 参考
* [菜鸟教程](http://www.runoob.com/design-pattern/design-pattern-tutorial.html "设计模式")
* [设计模式之禅]("设计模式之禅")