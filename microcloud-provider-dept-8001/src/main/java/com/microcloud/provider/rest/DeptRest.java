package com.microcloud.provider.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcloud.api.bean.Dept;
import com.microcloud.provider.service.DeptService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午3:57:42 
* 类说明 
*/

@RestController
public class DeptRest {
	
	@Resource
	private DeptService deptService;
	
	@RequestMapping(value="/dept/get/{id}")
	public Object get(@PathVariable("id")long id){
		return this.deptService.findById(id);
	}
	
	@RequestMapping(value="/dept/add")
	public Object add(@RequestBody Dept dept){
		return this.deptService.doCreate(dept);
	}
	
	@RequestMapping(value="/dept/list")
	public Object list(){
		return this.deptService.findAll();
	}
	
	@RequestMapping(value="/dept/sessionId")
	public Object id(HttpServletRequest request ){
		return request.getSession().getId();
	}

}
 