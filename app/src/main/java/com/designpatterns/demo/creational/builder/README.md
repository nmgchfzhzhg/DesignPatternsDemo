# 建造者模式


## 1、定义
     建造者模式属于创建型模式，提供一种创建对象的最佳方式
     建造者模式使用多个简单的对象一步一步构建成一个复杂对象，将一个复杂对象的构建与他的表示分离，
     使得同样的构建过程可以创建不同的表示。
## 2、介绍
* 注意
    * 1、类似抽象工厂模式
    * 2、用户只需要给出指定复杂对象的类型和内容
    * 3、单建造者模式负责按顺序创建复杂对象（把内部的建造过程和细节隐藏起来）
* 意图
    * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
* 主要解决
    * 方便用户创建复杂对象（不需要知道实现过程），将对象的构建过程和细节进行封装&复用
* 何时使用
    * 一些基本不见不会变，组合经常变化的时候使用
* 如何解决
    * 将变化与不变分离开
* 关键代码
    * 建造者：创建和提供实例，指挥者，利用具体建造者建造产品
* 优点
    * 易解耦，将产品本身与产品创建过程进行解耦，可以使用相同的创建过程来得到不同的产品，细节依赖抽象
    * 精确控制对象的创建，将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰
    * 易拓展，增加新的额具体建造者无需修改原有类库的代码，容易拓展，符合"开闭原则"
    * 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者活增加新的具体建造者，用户使用不同的具体建造者即可得到不同的产品对象
    * 良好的封装性，使用建造者模式可以使用客户端不必知道产品内部组成细节
    * 便于控制细节风险
* 缺点
    * 产品必须有共同点，范围有限制
    * 如果内部变化复杂，会有很多建造类，产生多余的Builder对象及Director对象，消耗内存
* 使用场景
    * 需要生成的对象具有复制的内部结构
    * 需要生成的对象内部属性本身相互依赖
    * 多个部件或者零件，都可以装配到一个对象中，但是产品的运行结果又不相同时
    * 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用
    * 当初始化一个对象特别复杂时，如参数多，切很多参数都有默认值
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/builder/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/builder/kotlin 'Kotlin')
* UML类图：

  ![建造者模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/creational/builder/imgs/建造者模式.png) 
* 注意事项
    * 建造者模式更加关注与零件装配的顺序，而工厂模式关心整体的对象
    * 建造者模式最主要的功能是基本方法调用顺序安排，也就是这些基本方法已经实现了，通俗的说就是零件的装配，顺序不同产生的对象也不同，工厂模式重点是创建，组装顺序不关心
## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/builder-pattern.html "RUNOOB.COM")
* [建造者模式（Builder Pattern）- 最易懂的设计模式解析](https://blog.csdn.net/carson_ho/article/details/54910597 "建造者模式")