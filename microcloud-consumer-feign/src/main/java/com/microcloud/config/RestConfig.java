package com.microcloud.config;

import java.nio.charset.Charset;
import java.util.Base64;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
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
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public HttpHeaders getHeaders(){//进行一个HTTP头信息配置
		HttpHeaders headers = new HttpHeaders();//定义一个HTTP的头信息
		String auth = "springcloud:123";//认证信息
		byte[] encodeAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));//进行一个加密处理
		//在进行授权的头信息内容配置的时候加密信息一定要与“Basic”之间有一个空格
		String authHeader = "Basic " + new String(encodeAuth);
		headers.set("Authorization", authHeader);
		return headers;
	}
}
 