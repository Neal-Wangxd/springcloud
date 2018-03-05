package com.microcloud.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcloud.api.bean.Dept;
import com.microcloud.service.DeptClientService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午4:22:10 
* 类说明 
*/
@RestController
public class ConsumerDeptController {
	
	@Resource
	private DeptClientService deptService;
	
	@RequestMapping(value="/consumer/dept/get")
	public Object getDept(long id){
		return this.deptService.get(id);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public Object listDept(){
		return this.deptService.list();
	}
	
	@RequestMapping(value="/consumer/dept/add")
	public Object addDept(Dept dept){
		return this.deptService.add(dept);
	}
}
 