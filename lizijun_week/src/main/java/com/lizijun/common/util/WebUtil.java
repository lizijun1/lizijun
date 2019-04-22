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
	@RequestMapping("list")
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
	@RequestMapping("int")
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
	@RequestMapping("boolean")
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
	@RequestMapping("url")
	public String getUrl(HttpServletRequest request){
	    //实现代码
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		return requestURI;
	}

	@Test
	public void cook(){
		Cookie cookie= new Cookie("aaa", "bbb");
		String value = cookie.getValue();
		
		System.out.println(value);
	}


	

}
