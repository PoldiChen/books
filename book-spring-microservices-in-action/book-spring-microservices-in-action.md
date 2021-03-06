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

13.微服务接口设计指导方针：<br>
(1) 拥抱REST的理念<br>
(2) 使用URI来传递意图<br>
(3) 请求和响应使用JSON<br>
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
20.低层级的属性文件，YAML（Yet another Markup Language）、XML、JSON。

21.用于实施配置管理系统的开源项目：Etcd、Eureka、Consul、ZooKeeper、Spring Cloud Config。

#### 第4章 服务发现
22.在任何分布式架构中，都需要找到机器所在的物理地址。这个概念自分布式计算开始就已经存在，并且被正式称为服务发现。

23.服务发现对于微服务和基于云的应用程序至关重要：<br>
(1) 提供在环境中运行的服务实例数量进行快速水平伸缩的能力。<br>
通过服务发现，服务消费者能够将服务的物理地址抽象出来，消费者不知道实际服务实例的物理地址，因此可以在服务池中添加或移除服务实例。<br>
(2) 有助于提高应用程序的弹性。<br>
微服务实例不可用时，服务发现引擎可以将其从服务列表中移除。

24.负载均衡器实现高可用：<br>
分为主负载均衡器和辅助负载均衡器，辅助负载均衡器处于空闲状态，并ping主负载均衡器以查看它是否处于存活状态，如果未处于存活状态，那么辅助负载均衡器将变为存活状态，接管主负载均衡器的IP地址并开始提供请求。

25.基于云的微服务环境的解决方案是使用服务发现机制，具有以下特点：<br>
(1) 高可用<br>
(2) 点对点<br>
服务发现集群中的每个节点共享服务实例的状态。<br>
(3) 负载均衡<br>
(4) 有弹性<br>
服务发现的客户端在本地缓存服务信息。<br>
(5) 容错<br>
检测服务实例的健康状态。

26.每个通过Eureka注册的服务都会有两个与之相关的组件：应用程序ID和实例ID。
应用程序ID用于表示一组服务实例。

27.基于云的微服务应该是短暂和无状态的，它们可以随意启动和关闭。IP地址更适合这类型的服务。

28.Eureka高可用：建立多个Eureka服务，以便相互复制注册表的内容。

#### 第5章 使用Spring Cloud和Netflix Hystrix的客户端弹性模式
29.客户端弹性软件模式的重点是，在远程服务发生错误或者表现不佳时保护远程资源（另一个微服务调用或数据库查询）的客户端免于崩溃。<br>
这些模式的目标是让客户端“快速失败”，而不消耗诸如数据库连接或线程池等宝贵资源，并且防止远程服务的问题向客户端的消费者进行“上游”传播。

30.4种客户端弹性模式：<br>
(1) 客户端负载均衡模式<br>
(2) 断路器模式<br>
(3) 后备模式<br>
(4) 舱壁模式<br>

31.客户端负载均衡模式<br>
让客户端从服务发现代理（如Netflix Eureka）查找服务的所有实例，然后缓存服务实例的物理地址。

32.断路器模式<br>
模仿电路断路器的客户端弹性模式。<br>
如果远程服务调用时间太长，断路器会介入并中断调用。<br>
如果一个远程资源的调用失败达到一定次数，断路器会采取快速失败，阻止继续调用失败的远程资源。

33.后备模式<br>
远程服务调用失败时，服务消费者将执行替代代码路径，并尝试通过其他方式执行操作，而不是生成一个异常。<br>
通常涉及从另一个数据源查询数据或者将客户端的请求进行排队。

34.舱壁模式<br>
把远程资源的调用分到线程池中，并降低一个缓慢的远程资源调用拖垮整个应用程序的风险。

#### 第6章 使用Spring Cloud和Zuul进行服务路由
35.微服务分布式架构中，将安全、日志、用户跟踪等横切关注点抽象成一个独立且作为应用程序中所有微服务调用的过滤器和路由器的服务，称为服务网关（service gateway）。

36.服务网关作为单个策略执行点（Policy Enforcement Point, PEP），所有的服务调用都通过网关进行路由，然后被路由到最终目的地。

37.服务网关充当服务调用者和被调用服务之间的中介。服务客户端仅与服务网关管理的单个URL交互，服务网关从服务客户端调用中分离出路径，确定客户端正在尝试调用哪个服务。

38.保持为服务网关编写的代码是无状态的。<br>
保持为服务网关编写的代码是轻量的，因为服务网关是服务调用的“阻塞点”。

39.Netflix Zuul的功能：<br>
(1) 将应用程序中的所有服务的路由映射到一个URL，开发人员也可以定义多个路由条目。<br>
(2) 构建可以对通过网关的请求进行检查和操作的过滤器，以一致的方式对所有服务调用执行大量操作。

40.Zuul服务引导类注解：
```java
@EnableZuulProxy
```

41.Zuul自动使用Eureka来通过服务ID查找服务，然后使用Netflix Ribbon对来自Zuul的请求进行客户端负载均衡。

42.Zuul的核心是一个反向代理，位于尝试访问资源的客户端和资源之间。反向代理负责捕获客户端请求，然后代表客户端访问远程资源。

43.Zuul路由映射的三种方式：<br>
(1) 通过服务发现自动映射路由<br>
(2) 通过服务发现手动映射路由<br>
(3) 使用静态URL手动映射路由

44.Zuul过滤器，用于强制执行一组一致的应用程序策略，如安全性、日志记录、服务跟踪等。有三种类型：<br>
(1) 前置过滤器：在Zuul将实际请求发送到目的地前被调用。通常用于确保服务具有一致的消息格式，比如HTTP头部；或者确保用户已通过验证和授权。<br>
(2) 路由过滤器：用于在调用目标服务之前拦截。通常用于对动态路由，比如同一服务的不同版本。（A/B测试）<br>
(3) 后置过滤器：在目标服务被调用并将响应发送回客户端后被调用。通常用于记录从目标服务返回的响应、处理错误或审核对敏感信息的响应。

45.Zuul前置过滤器可以生成一个关联ID，这个ID可以注入流经Zuul的每个服务中。

46.通过使用Spring Cloud Config服务器，可以动态的重新加载路由映射，无需重启Zuul服务。

#### 第7章 保护微服务
47.OAuth2是一个基于令牌的框架，允许用户使用第三方验证服务进行验证，验证成功后会出示一个令牌，该令牌必须与每个请求一起发送，验证服务对令牌进行确认。<br>

48.OAuth2将安全性分为4个部分：<br>
(1) 受保护的资源<br>
(2) 资源所有者<br>
(3) 应用程序<br>
(4) OAuth2验证服务器<br>

49.OAuth2规范具有4种类型的授权：<br>
(1) 密码<br>
(2) 客户端凭据<br>
(3) 授权码<br>
(4) 隐式

50.建立OAuth2验证服务，配置Spring，Spring Cloud安全库，Spring OAuth2库。
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-security</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.security.oauth</groupId>
    <artifactId>spring-security-oauth2</artifactId>
</dependency>
```

51.使用注解启用OAuth2服务：
```java
@EnableAuthorizationServer
```

#### 第8章 使用Spring Cloud Stream的事件驱动架构
52.使用异步消息在应用程序之间进行通信，这些消息代表了状态的变化，这个概念称为事件驱动架构，或消息驱动架构。

52.Spring Cloud通过Spring Cloud Stream子项目使构建基于消息传递的解决方案变得轻而易举。

53.当需要传递状态时，消息队列充当不同服务之间的中介，有4个好处：
- 松耦合
- 耐久性
- 可伸缩性
- 灵活性

54.随着Spring Cloud中消息的发布和消费，有4个组件涉及发布消息和消费消息：
- 发射器<br>
一个Spring注解接口，接收一个普通Java对象(POJO)，该对象代表要发布的消息。
- 通道<br>
对队列的一个抽象
- 绑定器
- 接收器

55.生产消息的服务中添加以下依赖和注解：
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-stream</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-kafka</artifactId>
</dependency>
```
```java
@EnableBinding(Source.class)
```

56.添加依赖使用Redis：
```xml
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-redis</artifactId>
</dependency>
<dependency>
    <groupId>redis.clients</groupId>
    <artifactId>jedis</artifactId>
</dependency>
```

#### 第9章 使用Spring Cloud Sleuth和Zipkin进行分布式跟踪

#### 第10章 部署微服务







end.
