# book-spring-boot-in-action
some notes and codes for the book Spring Boot in Action (Fourth Edition).

#### 第1章 入门
1.使用Spring Boot可以更加敏捷的开发Spring应用程序，专注于应用程序的功能，不用在Spring的配置上多花功夫，甚至完全不用配置。

2.Spring诞生时是Java企业版（Java Enterprise Edition，也称J2EE）的轻量级替代品，无需开发重量级的Enterprise JavaBean（EJB），Spring为企业级的Java开发提供了一种相对简单的方法，通过依赖注入和面向切面编程，用简单的Java对象（Plain Old Java Object，POJO）实现了EJB的功能。

3.虽然Spring的组件代码是轻量级的，但它的配置却是重量级的，有很多XML配置。

4.Spring Boot最重要的四个核心：
- 自动配置
针对很多Spring应用程序常见的应用功能，Spring Boot能自动提供相关配置。
- 起步依赖
告诉spring Boot需要什么功能，它就能引入需要的库。
- 命令行界面
spring Boot的可选特性
- Actuator
深入了解运行中的Spring Boot应用程序。

5.起步依赖：为项目的依赖管理提供帮助，以spring-boot-start开头

6.Actuator提供了在运行时检视应用程序内部情况的能力，包括：
- Spring应用程序上下文配置的Bean
- Spring Boot的自动配置做的策略
- 应用程序获取到的环境变量、系统属性、配置属性和命令行参数
- 应用程序里线程的当前状态
- 应用程序最近处理过的HTTP请求的追踪情况
- 各种和内存用量、垃圾回收、web请求以及数据源用量相关的指标

7.Spring Boot没有引入任何形式的代码生成，而是利用了Spring 4的条件化配置特性，以及Maven提供的传递依赖解析，依次实现Spring应用程序上下文里的自动配置。

#### 第2章 开发第一个应用程序
8.@SpringBootApplication将三个有用的注解组合在一起：<br>
@Configuration，Spring的注解，表明该类使用Spring基于Java的配置。<br>
@ComponentScan，Spring的注解，启用组件扫描，web控制器类和其他组件才能被自动发现并注册为Spring应用程序上下文里的Bean。<br>
@EnableAutoConfiguration，Spring Boot的注解，开启Spring Boot自动配置的功能。<br>

#### 第3章 自定义配置
9.Spring Boot自动配置的Bean提供了300多个用于微调的属性。调整设置时，可以在环境变量、Java系统属性、JNDI（Java Naming and Directory Interface）、命令行参数或属性文件里指定。

#### 第4章 测试







#### end.
