package com.lizijun.cms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lizijun.cms.bean.Dept;
import com.lizijun.cms.bean.Plan;
import com.lizijun.cms.mapper.PlanMapper;

@Service
@Transactional
public class PlanServiceImpl implements PlanService {
	@Resource
	private PlanMapper mapper;

	@Override
	public List getList(String name) {
		// TODO Auto-generated method stub
		return mapper.getList(name);
	}

	@Override
	public List<Dept> find() {
		// TODO Auto-generated method stub
		return mapper.find();
	}

	@Override
	public void add(Plan p) {
		// TODO Auto-generated method stub
		mapper.add(p);
	}
}
