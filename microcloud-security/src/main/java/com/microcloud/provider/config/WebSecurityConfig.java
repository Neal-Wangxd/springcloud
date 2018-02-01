package com.microcloud.provider.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年2月1日 上午10:58:49 
* 类说明 
*/

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Resource
	public void configGlobal(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("springcloud").password("123").roles("USER")
		.and().withUser("admin").password("123").roles("USER","ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		//表示所有的访问都必须进行认证处理后才可以正常进行
		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
		//所有的rest服务一定要设置为无状态，以提升操作性能
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
 