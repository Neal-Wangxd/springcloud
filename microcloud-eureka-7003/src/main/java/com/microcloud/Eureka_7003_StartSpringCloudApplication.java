package com.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年2月26日 下午3:35:10 
* 类说明 
*/
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7003_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7003_StartSpringCloudApplication.class, args);
    }
}
 