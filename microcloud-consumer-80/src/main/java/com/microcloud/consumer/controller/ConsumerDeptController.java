package com.microcloud.consumer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microcloud.api.bean.Dept;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午4:22:10 
* 类说明 
*/
@RestController
public class ConsumerDeptController {
	
	public static final String DEPT_GET_URL ="http://localhost:8001/springcloud-provider/dept/get/";
	public static final String DEPT_LIST_URL ="http://localhost:8001/springcloud-provider/dept/list/";
	public static final String DEPT_ADD_URL ="http://localhost:8001/springcloud-provider/dept/add";
	
	@Resource
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/dept/get")
	public Object getDept(long id){
		Dept dept = this.restTemplate.getForObject(DEPT_GET_URL+id, Dept.class);
		return dept;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/dept/list")
	public Object listDept(){
		List<Dept> depts = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
		return depts;
	}
	
	@RequestMapping(value="/dept/add")
	public Object addDept(Dept dept){
		Boolean flag = this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
		return flag;
	}
}
 