# 简单工厂模式


## 1、定义
     简单工厂模式又叫静态方法模式（工厂类定义一个静态方法），属于创建型模式
     简单工厂模式中，可以根据参数的不同返回不同的实例
     简单工厂模式定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类
     
## 2、介绍
* 注意
    * 1、简单工厂模式属于创建型模式
    * 2、简单工厂模式又叫做静态工厂方法模式
* 意图
    * 使用简单工厂模式模式可以将产品的消费和生成完全分开，客户端只需要知道需要什么产品，如何使用产品就可以
    具体的产品生成任务由具体的工程类来实现，工程类根据传进来的参数生成具体的产品共消费者使用，这种模式更加利于
    扩展，当有新产品加入时，工程中加入新产品的构造就可以
* 主要解决
    * 将"类实例化的操作"与"使用对象的操作"分开，让使用者不用知道具体参数就可以实例化所需要的"产品类"，避免了在客户端代码中显示指定，实现解耦
    即使用者可直接消费产品而不需要知道其生产的细节
* 何时使用
    * 明确的计划不同条件下创建不同的实例
* 如何解决
    * 子类实现公共接口，工厂类返回一个具体的产品类
* 关键代码
    * 抽象产品类（Product）：要创建的复杂对象，定义对象的公共接口，具体产品类（ProductA）：继承Product，工厂类（Factory）:返回具体产品类
* 优点
    * 将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现解耦
    * 把初始化实例时的工作放到工厂里进行，使代码更容易维护，更符合面向对象的原则&面向接口编程，而不是面向实现编程
* 缺点
    * 工厂类集中了所有的实例（产品）的创建逻辑，一旦这个工厂不能正常工作，正规系统会收到影响
    * 违背"开发-关闭原则"，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑国语复杂
    * 简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构
    * 简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构
* 使用场景
    * 工厂类负责创建的对象比较少，
    * 客户端只知道传入工厂类的参数，对于如何创建对象不关心，客户端既不需要关系创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数
    
# 3、实现
* [java方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/simplefactory/java 'java')
* [Kotlin方式实现](https://github.com/nmgchfzhzhg/DesignPatternsDemo/tree/master/app/src/main/java/com/designpatterns/demo/creational/simplefactory/kotlin 'Kotlin')
* UML类图：

  ![简单工厂模式](https://github.com/nmgchfzhzhg/DesignPatternsDemo/raw/master/app/src/main/java/com/designpatterns/demo/creational/simplefactory/imgs/简单工厂模式.png) 
* 优化
    * 简单工厂模式新增产品时需要直接修改工程类，违反了开放封闭原则，因此可以使用反射来创建实例对象，确保遵循开放封闭原则
    * 使用反色实现工厂类，新增产品无需修改工厂类，但是使用反射来创建实例对象比new对象效率低   
            
            public class CreateFactory {
                public static <T extends Product> T CreateFactory(Class<T> cls) {
                    Product product = null;
    
                    try {
                        //        反射出实例
                        product = (Product) Class.forName(cls.getName()).newInstance();
                        } catch (InstantiationException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    return (T) product;
                }
            }

## 参考链接
* [设计模式（一）简单工厂模式](https://blog.csdn.net/xingjiarong/article/details/49999121 "简单工厂模式")
* [简单工厂模式（SimpleFactoryPattern）- 最易懂的设计模式解析](https://www.jianshu.com/p/e55fbddc071c "简单工厂模式")