<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap.min.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.js" ></script>
<link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js" ></script>
<title>Insert title here</title>
</head>
<body>
<h1>投资项目详情</h1>
项目名称:${param.name }<br><br>
项目金额:${param.amount}<br><br>
项目领导:${param.manager }<br><br>
所属部门:${param.dname }<br><br>
项目说明:${param.content}<br><br>
</body>
</html>