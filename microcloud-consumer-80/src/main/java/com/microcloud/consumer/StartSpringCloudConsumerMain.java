package com.microcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.microcloud.commons.MyLoadBalanceConfig;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午3:35:10 
* 类说明 
*/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="ribbonClient",configuration=MyLoadBalanceConfig.class)
public class StartSpringCloudConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(StartSpringCloudConsumerMain.class, args);
    }
}
 