# book-spring-microservices-in-action
some notes and codes for some the book Spring Microservices in Action.

#### 第1章 欢迎迈入云世界，Spring
1.在微服务的概念形成之前，绝大多数基于web的应用都是使用单体架构的风格进行构建。

2.微服务是一个小的、松耦合的分布式服务。

3.微服务允许将一个大型的应用分解成具有严格职责定义的便于管理的组件；通过将大型代码分解为小型的精确定义的部分，帮助解决大型代码库中传统的复杂问题。

4.微服务的一个重要概念：分解和分离应用程序的功能，使它们完全彼此独立。

5.微服务架构具有以下特征：<br>
(1) 应用程序逻辑分解为具有明确职责定义的细粒度组件，这些组件相互协调提供解决方案。<br>
(2) 每个组件都有一个小的职责领域，并且完全独立部署。微服务应该对业务领域的单个部分负责。一个微服务应该可以跨多个应用程序复用。<br>
(3) 微服务通信基于一些基本的原则，采用HTTP和JSON这种轻量级的通信协议，在服务消费者和服务提供者之间进行数据交换。<br>
(4) 构建在微服务之上的应用程序能够使用多种编程语言和技术进行构建。<br>
(5) 微服务有助于组织明确责任领域的小型开发团队，多个团队可能有同一个目标，但只负责自己的服务。

6.Spring Boot是对Spring框架理念重新思考的结果，包含了Spring的核心特性，但剥离了Spring中的许多“企业”特性，提供一个基于Java的、面向REST的微服务框架。只需一些简单的注解，开发者就能快速构建一个可打包和部署的REST微服务，这个服务不需要外部的应用容器。

Spring Boot还极大的简化了将HTTP类型的动词映射到URL、JSON协议序列化与Java对象的相互转化，以及将Java异常映射回标准HTTP错误代码的工作。

7.微服务构建的应用程序的特性：<br>
(1) 灵活性：可将解耦的服务进行组合和重新安排，以快速交付新的功能。<br>
(2) 有弹性：故障可以限制在应用程序的一小部分中。<br>
(3) 可伸缩性：解耦的服务可以跨越多个服务器进行水平分布，适当的对功能进行伸缩。<br>

8.云计算的3种基本模式：<br>
(1) 基础设施即服务（Infrastructure as a Service, IaaS）<br>
(2) 平台即服务（Platform as a Service, PaaS）<br>
(3) 软件即服务（Software as a Service, SaaS）<br>

9.微服务架构的核心概念之一就是每个服务都被打包和部署为离散的独立制品。

10.服务部署的3种环境：<br>
(1) 物理服务器：不能快速提高物理服务器的容量，在多个物理服务器之间水平伸缩成本很高。<br>
(2) 虚拟机镜像：微服务可以打包在虚拟机镜像中。<br>
(3) 虚拟容器：在虚拟机镜像上部署微服务的自然延申。使用虚拟容器，可以将单个虚拟机隔离成共享相同虚拟机镜像的一系列独立进程。<br>

#### 第2章 使用Spring Boot构建微服务
11.基于微服务的架构有以下特点：<br>
(1) 有约束的--微服务具有范围有限的单一职责集。微服务遵循UNIX的理念，即应用程序是服务的集合。<br>
(2) 松耦合的--微服务之间使用非专属协议（HTTP、JSON）进行交互，只要接口没有变，各个微服务可以自由的修改。<br>
(3) 抽象的--微服务完全拥有自己的数据结构和数据源，数据只能由自己修改。<br>
(4) 独立的--每个微服务独立于应用程序中的其他服务进行编译和部署。<br>

12.如果微服务划分过于粗粒度：<br>
(1) 服务承担过多的职责<br>
(2) 服务需要跨大量的表来管理数据<br>
(3) 测试用例太多<br>

过于细粒度：<br>
(1) 问题域的一部分微服务像兔子一样繁殖<br>
(2) 微服务彼此间严重相互依赖<br>
(3) 微服务成为简单的CRUD服务的集合

13.微服务接口设计指导方针：
(1) 拥抱REST的理念
(2) 使用URI来传递意图
(3) 请求和响应使用JSON
(4) 使用HTTP状态码来传达结果

14.微服务之间通过消息进行通信，在数据更新中引入了延迟。应用程序需要保持最终一致性，数据的更新可能不会立即出现。

15.Spring Boot需要有一个Spring引导类，可被Spring Boot用于启动和初始化应用程序，用@SpringBootApplication注解，服务的核心初始化逻辑应该放在这个类中。
```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

16.微服务接口定义的URL应尽早建立版本控制方案，一种常见的模式是使用版本号作为前缀，比如：
```java
@RequestMapping(value="/v1/organizations/{organizationId}/licenses")
```

17.微服务应该始终是无状态的。

18.对某些运维团队来说，将运行时环境嵌入JAR文件中的理念是在部署应用程序时的重大转变。

19.Spring Actuator提供了开箱即用的运维端点，可帮助用户了解和管理服务的健康状况。
需要加入以下依赖，访问host:port/health即可查看。
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

#### 第3章 使用Spring Cloud配置服务器控制配置
20.

















end.