package com.microcloud.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;

/**
 * @author 作者 wxd
 * @version 1.0 E-mail: wangxudong@jetsen.cn 创建时间：2018年3月5日 下午2:13:32 类说明
 */
@Configuration
public class FeignClientConfig {

	@Bean
	public Logger.Level getFeignLoggerLevel(){
		return feign.Logger.Level.FULL;
	}
	
	@Bean
	public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("springcloud", "123");
	}

}
