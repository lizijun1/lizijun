package com.lizijun.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebUtil {
	//获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	@RequestMapping("list.do")
	public  String getString(HttpServletRequest request, String name, @RequestParam(defaultValue="默认值")String defaultValue){
		if(name!=null){
			System.out.println(name);
			return name;
		}else {
			System.out.println(defaultValue);
			return defaultValue;
		}
	    //实现代码
	}
	//获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认
	@RequestMapping("int.do")
	public int getInt(Integer aaa,@RequestParam(defaultValue="0")Integer defaultValue){
	    //实现代码
		if(aaa!=0){
			System.out.println(aaa);
			return aaa;
		}else{
			System.out.println(defaultValue);
			return defaultValue;
		}
	}
	//获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	@RequestMapping("boolean.do")
	public boolean getBoolean(boolean aaa){
	    //实现代码
		if (aaa==true ||aaa == false) {
			System.out.println(true);
			return true;
		}else{
			System.out.println(false);
			return false;
		}
	}
	//获取当前请求地址，注意参数不能丢 (5分)
	@RequestMapping("url.do")
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		return requestURI;
	}
	//给定一个Cookie名获得取Cookie值 (5分)
	@Test
	public void cook(){
		Cookie cookie= new Cookie("aaa", "bbb");
		String value = cookie.getValue();
		
		System.out.println(value);
	}


	

}
