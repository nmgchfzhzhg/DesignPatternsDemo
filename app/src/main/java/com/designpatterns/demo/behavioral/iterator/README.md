# 迭代器模式


## 1、定义
     迭代器模式属于行为模式
     迭代器模式又叫游标模式
     迭代器模式提供一种方法顺序访问一个聚合对象中的各种元素，而又不暴露该对象的内部表示。
     
## 2、介绍
* 注意
    * 1、迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据
* 意图
    * 提供一种方法顺序访问一个聚合对象中各个元素，而又无需暴露该对象的内部表示
* 主要解决
    * 不同的方式来遍历整个整合对象
* 如何解决
    * 把在元素之间游走的责任交给迭代器，而不是聚合对象
* 关键代码
    * Iterator（迭代器接口）:负责定义、访问和遍历元素的接口
    * ConcreteIterator（具体迭代器类）:实现迭代器接口
    * Aggregate（容器接口）:定义容器的基本功能以及提供创建迭代器的接口
    * ConcreteAggregate（具体容器类）:实现容器接口中的功能
* 优点
    * 简化了遍历方式，对于对象集合的遍历，还是比较麻烦的，对于数组或者有序列表，我们尚可以通过游标来取得，但用户需要在对集合了解很清楚的前提下，自行遍历对象，但是对于hash表来说，用户遍历起来就比较麻烦了，而引入了迭代器方法后，用户用起来就简单多了
    * 可以提供多种遍历方式，比如说对有序列表，我们可以根据需要提供正序遍历，倒序遍历两种迭代器，用户用起来只需要得到我们事先好的迭代器，就可以方便的对集合进行遍历了
    * 封装性良好，用户只需要得到迭代器就可以遍历，而对于遍历算法则不用去关心
* 缺点
    * 由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性
    * 遍历过程是一个单向且不可逆的遍历
    * 遍历过程需要注意容器是否改变，若期间改变了，可能会抛出异常
* 使用场景
    * 访问一个聚合对象的内容而无须暴露他的内部表示
    * 需要为聚合对象提供多种遍历方式
    * 为遍历不同的聚合结构提供一个统一的接口
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/iterator/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/iterator/kotlin 'Kotlin')
* UML类图：

  ![迭代器模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/behavioral/iterator/imgs/迭代器模式.png) 

## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/iterator-pattern.html "RUNOOB.COM")
* [Android的设计模式-迭代器模式](https://www.jianshu.com/p/f4917cb02752 "迭代器模式")
* [《JAVA与模式》之迭代子模式](http://www.cnblogs.com/java-my-life/archive/2012/05/22/2511506.html "《JAVA与模式》之迭代子模式")
