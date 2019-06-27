# book-spring-in-action
some notes and codes for the book Spring in Action (Fourth Edition).

#### 第1章 Spring之旅
1.为了降低Java开发的复杂性，Spring采取了以下四种关键策略：<br>
(1)	基于POJO的轻量级和最小侵入性编程<br>
(2)	基于依赖注入和面向接口实现松耦合<br>
(3)	基于切面和惯例进行声明式编程<br>
(4)	通过切面和模板减少样板式代码<br>

2.按照传统的做法，每个对象负责管理与自己相互协作的对象（即它所依赖的对象）的引用，这样会导致高度耦合和难以测试。

3.通过依赖注入，对象的依赖关系将由系统中负责协调各对象的第三方组件在创建对象的时候进行设定，对象无需自行创建或管理它们的依赖关系。

4.依赖注入的方式之一，构造器注入。

5.依赖注入的最大收益—松耦合。<br>
如果一个对象只通过接口（而不是具体实现或初始化过程）来表明依赖关系，那么这种依赖就能在对象本身毫不知情的情况下，用不同的具体实现进行替换。

6.创建应用组件之间协作的行为通常称为装配（wiring）。<br>
Spring有多种装配bean的方式，XML是其中常见的一种。

7.Sping通过应用上下文（Application Context）装载bean的定义并把它们组装起来。<br>
Spring应用上下文全权负责对象的创建和组装。

8.Spring自带了多种应用上下文的实现方式，主要的区别在于如何加载配置。<br>
AnnotationConfigApplicationContext：从一个或多个基于Java的配置类中加载Spring应用上下文。<br>
AnnotationConfigWebApplicationContext：从一个或多个基于Java的配置类中加载Spring Web应用上下文。<br>
ClassPathXmlApplicationContext：从类路径下的一个或多个XML配置文件中加载上下文定义，把应用上下文的定义文件作为类资源。<br>
FileSystemXmlApplicationContext：从文件系统下的一个或多个XML配置文件中加载上下文定义。<br>
XmlWebApplicationContext：从web应用下的一个或多个XML配置文件中加载上下文定义。

9.面向切面（aspect-oriented programming, AOP）允许把遍布应用各处的功能分离出来形成可重用的组件。<br>
面向切面往往被定义为促使软件系统实现关注点分离的一项技术。

10.在基于Spring的应用中，应用对象生存于Spring容器（container）中。<br>
Spring容器负责创建对象、装配它们、配置它们并管理它们的整个生命周期，从生存到死亡（从new到finalize()）。

11.Spring容器并不是只有一个。Spring自带了多个容器实现，可以归纳为两种不同的类型。<br>
bean工厂（由org.springframework.beans.factory.BeanFactory接口定义）是最简单的容器，提供基本的DI支持。<br>
应用上下文（由org.springframework.context.ApplicationContext接口定义）基于BeanFactory构建，并提供应用框架级别的的服务。<br>

12.bean的生命周期<br>
(1)	实例化<br>
(2)	填充属性<br>
(3)	调用BeanNameAware的setBeanName()方法<br>
(4)	调用BeanFactoryAware的setBeanFactory()方法<br>
(5)	调用ApplicationContextAware的setApplicationContext()方法<br>
(6)	调用BeanPostProcessor的预初始化方法<br>
(7)	调用InitializingBean的afterPropertiesSet()方法<br>
(8)	调用自定义的初始化方法<br>
(9)	调用BeanPostProcessor的初始化后方法<br>
(10)	使用bean<br>
(11)	容器关闭<br>
(12)	调用DisposableBean的destory()方法<br>
(13)	调用自定义的销毁方法<br>
(14)	结束<br>

13.Spring核心容器，包括Beans, Core, Context, Expression, Context support。<br>
容器是Spring框架最核心的部分，它管理着Spring应用中bean的创建、配置和管理。<br>

#### 第2章 装配Bean
14.在Spring中，对象无需自己查找或创建与其关联的其他对象，容器负责把需要相互协作的对象引用赋予各个对象。

15.创建应用对象之间协作关系的行为通常称为装配（wiring），这也是依赖注入（DI）的本质。

16.Spring三种主要的装配机制：<br>
(1)	在XML中进行显式配置<br>
(2)	在Java中进行显式配置<br>
(3)	隐式的bean发现机制和自动装配<br>

17.Spring从两个角度来实现自动化装配：<br>
(1)	组件扫描（component scanning）：Spring会自动发现应用上下文中所创建的bean<br>
(2)	自动装配（autowiring）：Spring自动满足bean之间的依赖<br>

18.实现自动装配的几个注解：<br>
(1)	注解@Component表明该类会作为组件类，并告知Spring要为这个类创建bean<br>
(2)	注解@ComponentScan能够在Spring中启用组件扫描<br>
(3)	注解@Autowired声明自动装配，Spring会在应用上下文中寻找某个bean需求的其他bean<br>
(4)	注解@Configuration表明这个类是一个配置类，该类应该包含在Spring应用上下文中如何创建bean的细节<br>

19.默认情况下，Spring中的bean都是单例的。

20.Spring框架的核心是Spring容器，容器负责管理应用中组件的生命周期，它会创建这些组件并保证它们的依赖得到满足。

#### 第3章 高级装配
21.Spring引入了bean profile功能，可以指定一个bean在某一个环境（开发或生产）生效，这样可以实现同一个构建产物（可能是war包）可以适用于所有环境，不用多次构建。
```java
@Profile("dev")
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans profile="dev">
</beans>
```

22.默认情况下，Spring应用上下文中所有bean都是以单例形式创建的。<br>
但有些类是易变的（mutable），会保持一些状态，因此重用是不安全的，这种情况下就不能声明为单例。

23.Spring定义了多种作用域，可以基于这些作用域创建bean，包括：<br>
单例（Singleton）：在整个应用中，只创建bean的一个实例<br>
原型（Prototype）：每次注入或者通过Spring应用上下文获取的时候，都会创建一个新的bean实例<br>
会话（Session）：在web应用中，为每个会话创建一个bean实例<br>
请求（Request）：在web应用中，为每个请求创建一个bean实例

可以使用注解@Scope定义作用域：
```java
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NotePad { ... }
```
或者使用xml配置定义作用域
```xml
<bean id="notepad" class="com.myapp.NotePad" scope="prototype" />
```

#### 第4章 面向切面的Spring
24.在软件开发中，散布于应用中多处的功能被称为横切关注点（cross-cutting concern）。<br>
通常来讲，这些横切关注点从概念上是与应用的业务逻辑分离的，如何分离正是面向切面编程（AOP）要解决的问题。

25.切面适用于多个场景，包括日志、安全、声明式事务、缓存。

26.描述切面的常用术语有通知（advice）、切点（pointcut）、连接点（join point）。<br>
**通知** 定义了切面是什么以及何时使用，还解决了何时执行这个工作的问题。<br>
Spring切面可以应用5种类型的通知：<br>
前置通知（Before）在目标方法被调用之前调用通知。<br>
后置通知（After）在目标方法完成之后调用通知，不会关心目标方法的输出。<br>
返回通知（After-returning）在目标方法成功执行之后调用通知。<br>
异常通知（After-throwing）在目标方法抛出异常后调用通知。<br>
环绕通知（Around）在被通知的方法调用之前和之后执行自定义的行为。<br>

**连接点** 是在应用程序执行过程中能够插入切面的一个点。<br>
**切点** 定义了通知被应用的具体位置（在哪些连接点），切点的定义会匹配通知所要织入的一个或多个连接点。<br>
**切面** 是通知和切点的结合。<br>

#### 第5章 构建Spring Web应用程序










#### end.
