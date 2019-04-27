package com.lizijun.cms.mapper;

import java.util.List;

import com.lizijun.cms.bean.Dept;
import com.lizijun.cms.bean.Plan;

public interface PlanMapper {

	List getList(String name);

	List<Dept> find();

	void add(Plan p);

}
