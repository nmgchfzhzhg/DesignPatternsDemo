# 备忘录模式


## 1、定义
     备忘录模式属于行为模式
     备忘录模式又叫做快照模式（Snapshot Pattern）或Token模式
     备忘录模式是一个用来存储另外一个对象内部状态的快照的对象，备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉住，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态
     备忘录模式尝尝与命令模式和迭代器模式一同使用
     
## 2、介绍
* 注意
    * 1、为了符合迪米特原则，还要增加一个管理备忘录的类
    * 2、为了节约内存，可使用原型模式+备忘录模式
* 意图
    * 在不破坏封装性的前提下，剟一个对象的内部状态，并在该对象之外保存这个状态
* 主要解决
    * 所谓的备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态
* 如何解决
    * 通过一个备忘录类专门存储对象状态
* 关键代码
    * Memento（备忘录角色）:
        * 1、将发起人（Originator）对象的内部状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人（Originator）对象的内部状态
        * 2、备忘录可以保护其内容不被发起人（Originator）对象之外的任何的对象所读取
        备忘录有两个等效的接口：
        * 窄接口：
          负责人（Caretaker）对象（和其他除发起人对象之外的任何对象）看到的是备忘录的窄接口（narrow interface），这个窄接口只允许他把备忘录对象传给其他的对象
        * 宽接口：
          与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口（wide interface），这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态
    * Originator（发起人角色）：
        * 1、创建一个含有当前的内部状态的备忘录对象
        * 2、使用备忘录对象存储其内部状态
    * Caretaker（负责人角色）：
        * 1、负责保存备忘录对象
        * 2、不检查备忘录对象的内容
* 优点
    * 能够让状态回滚到某一时刻的状态
    * 实现了状态保存对象的封装、用户无需关心其实现细节
* 缺点
    * 要保存的对象如果成员变量过多的话，资源消耗也会相应增多
* 使用场景
    * 需要保存和恢复数据的相关装填场景
    * 提供一个可回滚的操作
    * 需要监控的副本场景中
    * 数据库连接的事物管理就是用的备忘录模式
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/memento/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/memento/kotlin 'Kotlin')
* UML类图：

  ![备忘录模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/behavioral/memento/imgs/备忘录模式.png) 

## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/memento-pattern.html "RUNOOB.COM")
* [《JAVA与模式》之备忘录模式](http://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html "《JAVA与模式》之备忘录模式")
