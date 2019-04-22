package com.lizijun.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtil {
	
	public static void main(String[] args) {
		//判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		Set<String> set = new HashSet<String>();
		boolean notEmpty = notEmpty(set);
		System.out.println("是否为空:"+notEmpty);
		Map<String, String> map = new HashMap<String, String>();
		map.put("张三", "zhangsan");
		boolean notEmpty2 = notEmpty(map);
		System.out.println("是否为空:"+notEmpty2);
	}
	//判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(Collection collection){
		if(collection.isEmpty()==false){
			return false;
		}else {
			return true;
		}
	    //实现代码
	}
	//判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(Map<String,String> map){
		if(map.isEmpty()==false){
			return false;
		}else {
			return true;
		}
	
	}

}
