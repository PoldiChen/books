# book-method-of-architecture-practicing
some notes for the book <架构修炼之道>.

#### 第1章 网关之道
1.API网关：将所有API的调用统一接入API网关层，由网关层负责接入和输出。<br>
两个特点：访问量大、依赖系统多。

2.网关和代理：<br>
代理：纯粹的数据透传，协议不会发生变化<br>
网关：在数据透传的背景下，还会涉及协议的转换

3.一个API网关的四大基本功能：
- 统一接入<br>
高性能、高并发、高可靠、负载均衡
- 协议适配<br>
HTTP、Dubbo
- 流量管控与容错<br>
限流、降级、熔断
- 安全防护<br>
防刷、黑白名单

4.servlet是基于Java的web组件，由容器进行管理并生成动态内容。<br>
servlet也是基于平台无关的Java类格式，被编译为平台无关的字节码，可以被基于Java技术的web服务器动态加载并运行。<br>
容器（container）有时候也叫作servlet引擎，是web服务器为支持servlet功能扩展的部分。<br>
客户端通过servlet容器实现的request/response模式与servlet进行交互。

5.同步和异步、阻塞和非阻塞<br>
同步、异步是数据通信的方式，阻塞和非阻塞是一种状态。

6.Tomcat NIO Connector:<br>
NIO是一种I/O的模型，与传统的BIO相比，可以利用较少的线程处理更多的连接从而增加机器的吞吐量。<br>
Tomcat的Connector的三种模式：BIO、NIO、APR

7.网关系统的7种武器：<br>
降级、限流、熔断、线程池隔离、管道技术、配置热更新、异步。

#### 第n章
