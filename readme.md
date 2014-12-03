fork 一个新分支的目的是：

- 尝试使用war包的形式发布系统。

- 使用war形式发布的时候需要做两个改变：
    1. 使用war形式打包。
    2. 采用SpringBootServletInitializer的形式扫描Application的配置

------------

##参考文档：##
- [spring-boot](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/)
- [spring-boot-actuator](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java?source=c#L117)