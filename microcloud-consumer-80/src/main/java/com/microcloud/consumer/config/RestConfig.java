package com.microcloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午4:18:48 
* 类说明 
*/

@Configuration
public class RestConfig {

	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
 