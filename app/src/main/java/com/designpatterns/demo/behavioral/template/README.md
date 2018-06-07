# 模板方法模式


## 1、定义
     模板方法模式属于行为模式
     模板方法：准备一个抽象类，将部分逻辑以具体方法以及具体的构造函数的形式实现，
     然后声明一些抽象方法来迫使子类实现剩余的逻辑，不同的子类可以以不同的方式实现这些抽象方法，从而对剩余的逻辑有不同的实现
     模板方法主要是用来定义一套流程下来的固定步骤，而具体的步骤实现则可以是不固定的
     
## 2、介绍
* 注意
    * 1、子类可以置换掉父类的可变部分，但是子类却不可以改变模板方法所代表的顶级逻辑
    * 2、为防止恶意操作，一般模板方法都加上final关键字
* 意图
    * 定义一个操作中的算法骨架，而将一些步骤延迟的子类中，模板方法是得子类可以不改变一个算法的结构即可重定义该算法的某些特定的步骤
* 主要解决
    * 一些方法通用，却在每一个子类都重新写了这一方法
* 如何解决
    * 将通用算法抽象出来
* 关键代码
    * Account（抽象模板角色类）:定义一整套算法框架
    * MoneyMarketAccount、CDAccount（具体模板角色类）:具体实现类，根据需要实现抽象类中的方法
* 优点
    * 提高代码复用性，去除子类中的重复代码
    * 提高扩展性，不同实现细节放到不同子类中，易于增加新行为
* 缺点
    * 每个不同的实现都需要定义一个紫烈，这会导致类的个数增加，设计更加抽象
* 使用场景
    * 一次性实现算法的执行顺序和固定不变部分，可变部分则交由子类来实现
    * 多个子类中拥有相同的行为时，可以将其抽取出来放在父类中，避免重复的代码
    * 使用钩子方法来让子类决定父类的某个步骤是否执行，实现子类对父类的反向控制
    * 控制子类扩展，模板方法只在特定点调用钩子方法，这样就只允许在这些点进行扩展
    * 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现
    * 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/template/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/template/kotlin 'Kotlin')
* UML类图：

  ![模板方法模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/behavioral/template/imgs/模板方法模式.png) 
* 注意事项
    抽模板方法模式中的方法可以分为两大类：
    * 模板方法
      一个模板方法是定义在抽象类中，把基本操作方法组合在一起形成一个总算发或一个总行为的方法
      一个抽象类可以有任意多个模板方法，而不限一个模板方法都可以调用任意多个具体方法
    * 基本方法
      * 抽象方法：一个抽象方法由抽象类声明，由具体子类实现，在java语言里抽象方法以abstract关键字标识
      * 具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换
      * 钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展，通常抽象类给出的实现是一个空实现，作为方法的默认实现
## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/template-pattern.html "RUNOOB.COM")
* [Android的设计模式-模板方法模式](https://www.jianshu.com/p/9a480322aee1 "模板方法模式")
* [《JAVA与模式》之模板方法模式](http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html "《JAVA与模式》之模板方法模式")
