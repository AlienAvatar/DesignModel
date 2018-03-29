# DesignModel
##设计模式

### 策略模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/strategy.png)

设计原则：多用组合，少用继承

『策略模式』 定义了算法族，分别封装起来，让它
们之间可以互相替换，此模式让算法的变化独立于使用
算法的客户。

### 观察者模式

![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/observer.png)

设计原则:为了交互对象之间的松耦合设计而
努力。

松耦合:改变主题或观察者其中一方，并不会影响另一方。

『观察者模式』定义了对象之间的一对多依赖，这
样一来，当一个对象改变状态时，它的所有依赖者都
会收到通知并自动更新。

1.观察者模式定义了对象之间一
  对多的关系。
  
2.主题（也就是可观察者）用一
  个共同的接口来更新观察者。
  
3.观察者和可观察者之间用松
  耦合方式结合（loosecoupl-
  ing），可观察者不知道观察
  者的细节，只知道观察者实现
  了观察者接口。
  
4.使用此模式时，你可从被观察
  者处推（push）或拉（pull）
  数据（然而，推的方式被认为
  更“正确”）。

5.有多个观察者时，不可以依赖
  特定的通知次序。

6.此模式也被应用在许多地方，
  例如：JavaBeans、RMI。  
  
### 装饰器模式

![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/decorate.png)

设计原则：类应该对扩展开放，对修改关闭。

『装饰器模式』动态地将责任附加到对象上。
若要扩展功能，装饰者提供了比继承更有弹性
的替代方案。

装饰者可以在所委托被装饰者的行为之前与 / 或之后，加上自己的行为，以达到特定的目的。

### 工厂模式

![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/factory.png)

###工厂方法模式    
 『工厂方法模式』定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 
 工厂模式封装对象
 
 依赖倒置原则
 设计原则： 要依赖抽象，不要依赖具体类
 
 变量不可以持有具体类的引用
 
 不要让类派生自具体类
 
 不要覆盖基类中已经实现的方法
 （尽量达到这个原则）
  
#### 抽象工厂模式
提供一个接口，用于创建相关或依赖的家族，而不需要明确指定具体类

工厂方法和抽象工厂的区别
工厂方法使用继承：把对象的创建委托给子类，子类实现工厂方法来创建对象
抽象工厂使用对象组合：对象的创建被实现在工厂接口所暴露出来的方法中


所有的工厂模式都通过减少应用程序和具体类之间的依赖，促进松耦合。
依赖倒置原则，指导我们避免依赖具体类型，而要尽量依赖抽象。

### 单件模式

『单件模式』确保一个类只有一个实例，并提供一个全局访问点

1.给getInstance()加上同步锁
2.静态实例化
3.双重检查加锁

单件模式也提供访问这个实例的全局点。
在Java中实现单件实例需要个私有构造器，一个静态方法，一个静态变量。
确定性能和资源上的限制，然后小心地选择适当的方案来实现单件，以解决多线程问题（假定所有程序都是多线程的）。
如果使用多个类加载器，可能导致单件失效。

### 命令模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/order.png)

『命令模式』将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化对象。命令模式也支持可撤销工作。

命令模式将发出请求的对象和执行请求的对象解耦

命令可以支持撤销，做法是执行undo()状态回到excute()之前的状态。

命令也可以用来实现日志和事务系统。

### 适配器模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/adapter.png)

『适配器模式』 将一个类的接口，转换成客户期望的另一个接口。适配器让原本不兼容的类合作无间。

### 外观模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/facade.png)

『外观模式』 提供一个统一的接口，用来访问子系统中的一群接口。外观定义一个高层接口，让子系统更容易使用。

外观模式意图是简化接口
适配器模式意图是将一个接口改造为另一个接口

设计原则：只和你的密友谈话。

1.该对象本身。
2.被当做方法参数而传递进来的对象。
3.此方法所创建或实例化任何对象。
4.对象的任何组件。

适配器将一个对象包装起来以改变接口；
装饰器将一个对象包装起来以增加新的行为和责任；
而外观将一群对象“包装”起来以简化其接口。

### 模板方法模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/template.png)

『模板方法模式』在一个方法中定义一个方法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义
算法中的某些步骤。

钩子是一种方法，它在抽象类中不做事，或者只做默认的事，子类可以选择要不要去覆盖它。

为了防止子类覆盖模板中的算法，可以把方法声明成final。

好莱坞原则告诉我们，将决策权放在高层模块中，以便决定以及何时调用底层模块。

策略模式和模块方法都是封装算法，一个用组合，一个用继承。

工厂方法是模板方法的一个特殊版本。

### 迭代器模式
![image](https://github.com/AlienAvatar/DesignModel/blob/master/images/iterator.png)

Aggregate是个聚合类，其中createIterator()方法中可以产生一个Iterator

Iterator主要定义了hasNext()和next()方法

Client组合了Aggregate,为了迭代遍历Aggregate,也需要组合Iterator

『迭代器模式』提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

设计原则：一个类应该只有一个引起变化的原因。

### 组合模式

『组合模式』允许将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致性的方式处理个别对象和对象组合。


