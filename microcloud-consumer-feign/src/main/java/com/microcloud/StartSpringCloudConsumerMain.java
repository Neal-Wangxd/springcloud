package com.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午3:35:10 
* 类说明 
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.microcloud.service"})
public class StartSpringCloudConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringCloudConsumerMain.class, args);
    }
}
 