##启动方式：##
1. 本地执行：进入complete子模块中执行Application.java类（包含main方法）
2. war执行：通过IDE插件执行package命令生成war包，将war包拷贝到tomcat/webapp目录下执行


----------
fork 一个新分支的目的是：

- 尝试使用war包的形式发布系统。

- 使用war形式发布的时候需要做两个改变：
    1. 使用war形式打包。
    2. 采用SpringBootServletInitializer的形式扫描Application的配置



------------

##参考文档：##
- [spring-boot](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/)
- [spring-boot-actuator](https://github.com/spring-projects/spring-boot/blob/master/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/autoconfigure/EndpointWebMvcAutoConfiguration.java?source=c#L117)