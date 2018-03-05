package com.microcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.microcloud.api.bean.Dept;
import com.microcloud.commons.config.FeignClientConfig;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年3月5日 下午2:21:05 
* 类说明 
*/
@FeignClient(value="SPRINGCLOUD-PROVIDER-DEPT",configuration=FeignClientConfig.class)
public interface DeptClientService {

	@RequestMapping(method=RequestMethod.GET,value="/dept/get/{id}")
	public Dept get(@PathVariable("id") long id);
	
	@RequestMapping(method=RequestMethod.GET,value="/dept/list")
	public List<Dept> list();
	
	@RequestMapping(method=RequestMethod.POST,value="/dept/add")
	public Dept add(Dept dept);
	
}
 