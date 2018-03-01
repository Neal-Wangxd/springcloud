package com.microcloud.provider.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.microcloud.api.bean.Dept;
import com.microcloud.provider.dao.DeptDao;
import com.microcloud.provider.service.DeptService;

/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月30日 下午2:50:33 
* 类说明 
*/
@Service
public class DeptServiceImpl implements DeptService {

	@Resource
	private DeptDao deptDao;
	
	public boolean doCreate(Dept dept) {
		return this.deptDao.doCreate(dept);
	}

	public Dept findById(Long id) {
		return this.deptDao.findById(id);
	}

	public List<Dept> findAll() {
		return this.deptDao.findAll();
	}

	

}
 