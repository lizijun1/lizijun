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
<form action="list.do" method="post">
	名字<input name="name" value="${name }">
	<input type="submit" value="搜索">
</form>
	<a href="add.jsp"><input value="项目发布" type="button"></a>
	<table class="table table-bordered">
		<tr>
			<td>id</td>
			<td>项目名字</td>
			<td>投资金额</td>
			<td>分管领导</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="g">
			<tr>
			<td>${g.id }</td>
			<td>${g.name }</td>
			<td>${g.amount }</td>
			<td>${g.manager }</td>
			<td>${g.dname }</td>
			<td><a href="show.jsp?name=${g.name}&=${g.name}&amount=${g.amount}&manager=${g.manager}&dname=${g.dname}&content=${g.content}">查看详情</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
			${fenye }</td>
		</tr>
	</table>
</body>
</html>