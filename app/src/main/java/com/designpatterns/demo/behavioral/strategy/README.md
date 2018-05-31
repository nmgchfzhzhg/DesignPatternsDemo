# 策略模式


## 1、定义
     策略模式属于行为模式
     针对一组算法，将每一个算法封装到具有共同接口的独立的类中，使他们可以互相替换，让算法可在不影响客户端的情况下发生变化
     
## 2、介绍
* 注意
    * 1、策略模式重心：策略模式的重心不是如何实现算法，而是如何组织、调用这些算法，从而让程序结构更灵活，具有更好的维护性和扩展性
    * 2、算法的平等性：策略模式一个很大的特点就是哥哥策略算的平等性，对于一系列具体的策略算法，大家的地位都是一样的
         正因为这个平等性，才能实现算法之间可以互相替换，所有的策略模式在实现上也是相互独立的，相互直接没有依赖
         所以可以魔术一系列策略模式：策略模式是相同行为的不同实现
    * 3、运行时策略的唯一性：运行期间，策略模式在每一个时刻只能使用一个具体的策略实现对象，虽然可以动态的在不同的策略实现中切换，但是同时只能使用一个
    * 4、公有的行为：经常见到的是，所有的具体策略类都有一些公有的行为，这时候，就应当把这些公有的行为放到共同的抽象策略角色类里面
         当然这时候抽象策略角色必须要用java抽象类实现，而不能使用接口
* 意图
    * 将定义一系列的算法，将每个算法封装成独立的类，并且每个类可以互相替换
* 主要解决
    * 多种算法相似的情况，使用if...else带来的复杂和难以维护
* 如何解决
    * 将这些算法封装成单独的类，任意替换
* 关键代码
    * Member（抽象策略类或接口） 提供具体策略类需要实现的接口
    * PrimaryMember、IntermediateMember、AdvancedMember（具体策略类）具体策略实现，，封装了相关算法实现
    * Price（环境类）用来操作策略的上下文
* 优点
    * 策略类可以互相替换，策略类都实现了同一个接口，所以他们能够互相替换
    * 耦合度地，方便扩展 增加一个新的策略只能需要添加一个具体的策略类即可，基本不需要更改原有代码，符合开闭原则
    * 避免使用多重条件选择语句（if-else或者switch）
* 缺点
    * 策略的增多会导致子类也会变多
    * 客户端必须知道所有的策略类，并自行决定使用哪一个策略类
* 使用场景
    * 多个类只有在算法或行为上稍有不同的场景
    * 算法需要自由切换的场景
    * 需要屏蔽算法规则的场景
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/strategy/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/strategy/kotlin 'Kotlin')
* UML类图：

  ![策略模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/behavioral/strategy/imgs/建造者模式.png) 
* 注意事项
    * 如果一个系统的策略多余四个，需要考虑使用混合模式，解决策略类的膨胀问题
    * 一般来说策略模式不会单独使用，跟模板方法模式、工厂模式等混合使用
## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/strategy-pattern.html "RUNOOB.COM")
* [策略模式（Strategy Pattern）- 最易懂的设计模式解析](https://www.jianshu.com/p/0c62bf587b9c "策略模式")
* [《JAVA与模式》之策略模式](http://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html "策略模式")