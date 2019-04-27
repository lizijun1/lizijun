package com.lizijun.cms.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lizijun.cms.bean.Dept;
import com.lizijun.cms.bean.Plan;
import com.lizijun.cms.service.PlanService;
import com.lizijun.cms.utils.PageUtils;


@Controller
public class PlanController {
	
	@Resource
	private PlanService plan;
	
	@RequestMapping("list.do")
	public String getList(
			@RequestParam(defaultValue="")String name,
			@RequestParam(defaultValue="1")Integer cpage , 
			HttpServletRequest request){
	
		int pageSize=2;
		PageHelper.startPage(cpage, pageSize);
		List list= plan.getList(name);
		PageInfo info = new PageInfo(list);
		request.setAttribute("list", info.getList());
		request.setAttribute("name", name);
		PageUtils pageUtils = new PageUtils(cpage, (int)info.getTotal(), pageSize, "list.do?name="+name, request);
		
		return "list";
	}
	@RequestMapping("find.do")
	@ResponseBody
	public Object find(){
		List<Dept> list = plan.find();
		return list;
	}
	
	@RequestMapping("add.do")
	public String add(Plan p){
		plan.add(p);
		return "redirect:list.do";
	}
}
