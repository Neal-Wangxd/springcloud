package com.microcloud.provider.service;

import java.util.List;

import com.microcloud.api.bean.Dept;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午2:49:21 
* 类说明 
*/
public interface DeptService {
	
	public boolean doCreate(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();
}
 