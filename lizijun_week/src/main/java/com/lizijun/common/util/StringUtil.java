package com.lizijun.common.util;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	public static void main(String[] args) {
		//判断源字符串是否有值
		String src = "   ";
		boolean hasLength = hasLength(src);
		System.out.println("是否有值："+hasLength);
		//判断源字符串是否有值
		boolean txt = hasText(src);
		System.out.println("是否有值："+txt);
		//：判断是否为手机号码 
		String str = "13348398372";
		boolean mobile = isMobile(str);
		System.out.println("是否为手机号码:"+mobile);
		//方法4：判断是否为邮箱 (5分)
		String str1 = "13348398372@qq.com";
		boolean email = isEmail(str1);
		System.out.println("是否为邮箱:"+email);
		//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		String str2 = "abcdefg";
		String reverse = reverse(str2);
		System.out.println("反转之后"+reverse);
	}
	//判断源字符串是否有值，空引号(空白字符串)也算没值 
	public static boolean hasLength(String src){
		if(src.length()==0 || src=="" || src==null ){
			return false;
		}else{
			return true;
		}
	}
	//判断源字符串是否有值，空引号(空白字符串)也算没值 
	public static boolean hasText(String src){
		if(src.isEmpty()==false ){
			return false;
		}else{
			return true;
		}
	}
	//：判断是否为手机号码 
	public static boolean isMobile(String src){
		String reg = "1[3|5|8]\\d{9}";
		if(src.matches(reg)){
			return true;                  
		}else {
			return false;
		}
		
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
	    //实现代码
		String reg = "\\w+@\\w+(.com|.cn|.com.cn)";
		if(src.matches(reg)){
			return true;                  
		}else {
			return false;
		}
	}
	
		//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
		public static String reverse(String src){
			return StringUtils.reverse(src);
		}

}
