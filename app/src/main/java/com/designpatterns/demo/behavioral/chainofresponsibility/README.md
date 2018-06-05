# 责任链模式


## 1、定义
     责任链模式属于行为模式
     责任链模式：为请求创建一个接受者对象的链，这种模式给予请求的类型，对请求的发送者和接收者进行解耦
     通常每个接收者都包含对另一个接收者的引用，如果一个对象不能处理该请求，那么他会把相同的请求传给下一个接收者，依次类推
     责任链模式核心在于引入了一个抽象处理者
    
     
## 2、介绍
* 注意
    * 1、链中节点数量需要控制，避免出现超长链的情况
* 意图
    * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接受请求，将这些对象连接成一条链，并且沿着这条链传递请求，知道有对象处理他为止
* 主要解决
    * 职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的接收者解耦
* 如何解决
    * 拦截的类都实现统一接口
* 关键代码
    * Postman：建抽象处理者类 快递员抽象类
    * BeijingPostman、ShanghaiPostman、GuangzhouPostman：现抽象者处理类
* 优点
    * 代码的解耦，请求者与处理者的隔离分开，无需知道那个对象处理请求
    * 简化对象的互相连接，仅保持一个指向后者的引用，而不需要保持所有候选者接受者的引用
    * 易于扩展，新增处理者往链上加节点即可，只需要客户端重新建链即可，无需破坏原代码
* 缺点
    * 责任链过长的话，或者链上的节点判断处理时间太长的话影响性能，特别是递归循环的时候
    * 请求有可能遍历完链都得不到处理
* 使用场景
    * 多个对象处理同一请求时，但是具体由那个对象去处理需要运行时做判断
    * 具体处理者不明确的情况下，想这组对象提交了一个请求
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/chainofresponsibility/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/behavioral/chainofresponsibility/kotlin 'Kotlin')
* UML类图：

  ![责任链模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/behavioral/chainofresponsibility/imgs/责任链模式.png) 
* 注意事项
    * 纯
      要么承担全部责任，要么将责任推给下家，不允许出现某一个具体处理者对象在承担了一部分或全部责任后又将责任向下传递的情况
    * 不纯
      允许某个请求被一个具体处理者部分处理后在向下传递，或者一个具体处理者处理完某请求后其后继续处理者可以继续处理请求，而且一个请求可以最终不被任何处理者对象所接收
## 参考链接
* [RUNOOB.COM](http://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html "RUNOOB.COM")
* [Android的设计模式-责任链模式](https://www.jianshu.com/p/7fa31c57cbb5 "责任链模式")
* [《JAVA与模式》之责任链模式](https://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html "《JAVA与模式》之责任链模式")
