package com.lizijun.cms.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lizijun.cms.bean.Plan;
import com.lizijun.cms.service.PlanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDemo {
	@Resource
	private PlanService plan;
	//测试列表
	@Test
	public void test1(){
		List list = plan.getList("");
		for (Object object : list) {
			System.out.println(object);
		}
	}
	//测试回显
	@Test
	public void test2(){
		List list = plan.find();
		for (Object object : list) {
			System.out.println(object);
		}
	}
	//测试添加
	@Test
	public void test3(){
		Plan p = new Plan(null, "项目", "4566", "1", "1", 2);
		plan.add(p);
		
	}
}
