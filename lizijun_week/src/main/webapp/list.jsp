<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.11.1.min.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.validate.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="list">
		字符串<input name="name">
		<input type="submit">
	</form>
	
	<form method="post" action="int">
		数字<input name="int">
		<input type="submit">
	</form>
	
	<form method="post" action="boolean">
		布尔<input name="bo">
		<input type="submit">
	</form>
	
	<form method="post" action="url">
		<input type="submit">
	</form>
</body>
</html>