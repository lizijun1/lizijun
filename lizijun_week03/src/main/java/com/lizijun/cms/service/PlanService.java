package com.lizijun.cms.service;

import java.util.List;

import com.lizijun.cms.bean.Dept;
import com.lizijun.cms.bean.Plan;

public interface PlanService {

	List getList(String name);

	List<Dept> find();

	void add(Plan p);

}
