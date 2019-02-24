# quick start
pom.xml中添加
    <dependency>
        <groupId>net.toalaska</groupId>
        <artifactId>passport-spring-boot-starter</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
    
调用
     @Autowired
     PassportClient passportClient;
     
     passportClient.check("user_id","user_token")；
