# 抽象工厂模式


## 1、定义
     抽象工厂模式：为创建一族相关或者相互依赖的对象提供一个接口，而无需指定他们的具体类
     抽象工厂模式：是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂
     抽象工厂模式：创建型模式，提供一种创建对象的最佳方式
     抽象工厂模式：接口负责创建一个相关对象的工厂，不需要显示指定他们的类
                 每个生成的工厂都能按照工厂模式提供对象
## 2、介绍
* 注意
    * 1、多个抽象产品类，每个抽象产品类可以派生出多个具体产品类
    * 2、一个抽象工厂类，可以派生出多个具体工厂类
    * 3、并且每一个具体工厂类可以创建多个具体产品类的实例
* 意图
    * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定他们具体的类
* 主要解决
    * 每个工程只能创建一类产品，即工厂方法模式的缺点
* 何时使用
    * 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品
* 如何解决
    * 在一个产品族里，定义多个产品
* 关键代码
    * 抽象产品族（Product）抽象产品的父类，描述抽象产品的公共接口
      抽象产品（ContainerProduct) 具体产品的父类 描述具体产品的公共接口
      具体产品（ContainerProductA) 抽象产品的子类，工厂类创建的目标类 描述生成的具体产品
      抽象工厂（Factory）具体工厂的父类 描述具体工厂的公共接口
      具体工厂（FactoryA）抽象工厂的子类，被外界调用 描述具体工厂，实现工厂方法创建产品实例
* 优点
    * 降低耦合 抽象工厂模式将具体产品的创建延迟到具体工厂的子类中，这样讲对象的创建封装起来，减少客户端与具体产品类之间的依赖
      从而使系统耦合度低，有利于后期的维护、扩展
    * 更符合开-闭原则 新增一种产品类时，只需要增加相应的具体产品类和相应的工程子类即可
    * 符合单一职责原则 每个具体工厂类只负责创建对应产品
    * 不使用静态方法，形成基于继承的等级结构
* 缺点
    * 抽象工厂模式很难支持新种类产品的变化，抽象工厂接口中已经确定了可以被创建的产品集合，如果需要添加新产品
      必须去修改抽象工厂的接口，这样就涉及到抽象工厂类及所有子类的改变，
* 使用场景
    * 系统有多个系列产品，而系统中只消费其中某一系列产品
    * 系统要求提供一个产品类的库，所有产品以同样的接口出现，客户端不需要依赖具体的实现
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/abstractfactory/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/abstractfactory/kotlin 'Kotlin')
* UML类图：

  ![抽象工厂模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/creational/abstractfactory/imgs/抽象工厂模式.png)  
* 使用步骤
    * 1、创建抽象工厂类，定义抽象工厂的公共接口
    * 2、创建抽象产品族类，定义抽象产品的公共接口
    * 3、创建抽象产品类（继承抽象产品族类），定义具体产品的公共接口
    * 4、创建具体产品类（继承抽象产品类），定义生产的具体产品
    * 5、创建具体工厂类（继承抽象工厂类），定义创建对应具体产品市里的方法
    * 6、客户端通过实例化具体的工程类，并调用其创建不同目标产品的方法创建不同具体产品类的实例
## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/abstract-factory-pattern.html "RUNOOB.COM")
* [抽象工厂模式（Abstract Factory）- 最易懂的设计模式解析](https://www.jianshu.com/p/7deb64f902db "抽象工厂模式")