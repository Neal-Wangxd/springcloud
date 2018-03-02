package com.microcloud.commons;

import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.IRule;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月2日 上午10:02:21 
* 类说明 ： 自定义ribbon配置
*/
public class MyLoadBalanceConfig {//其中IRule就是所有规则的标准

	@Bean
	public IRule ribbonRule(){
		return new com.netflix.loadbalancer.RandomRule();//随机的访问策略
	}
	
}
 