package com.microcloud.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.microcloud.api.bean.Dept;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午2:36:48 
* 类说明 
*/

@Mapper
public interface DeptDao {
	
	public boolean doCreate(Dept dept);
	public Dept findById(Long id);
	public List<Dept> findAll();
	
}
 