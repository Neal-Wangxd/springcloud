package com.microcloud.provider;

import java.util.Date;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.microcloud.api.bean.Dept;
import com.microcloud.provider.service.DeptService;


/** 
* @author 作者 wxd  
* @version 1.0
* E-mail: wangxudong@jetsen.cn
* 创建时间：2018年1月17日 下午5:03:55 
* 类说明 
*/
@SpringBootTest(classes = StartSpringCloudProviderMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDept {

	@Resource
	private DataSource dataSource;
	
	@Resource
	private DeptService deptService;
	
	@Test
	public void testConnection() throws Exception{
		System.out.println(this.dataSource.getConnection()+"*********************");
	}
	
	@Test
	public void testFindById(){
		System.out.println(this.deptService.findById(1L));
	}
	
	@Test
	public void testFindAll(){
		System.out.println(this.deptService.findAll());
	}
	
	@Test
	public void testDoCreate(){
		Dept dept = new Dept();
		dept.setDname("测试部门"+new Date());
		System.out.println(this.deptService.doCreate(dept));
	}
}
 