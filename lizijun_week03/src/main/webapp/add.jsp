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
<h1>项目发布</h1>

	<form action="add.do" method="post">
	项目名称:<input name="name"><br><br>
	项目金额:<input name="amount"><br><br>
	项目领导:<input name="manager"><br><br>
	所属部门:<select id="s1" name="did">
		<option>-请选择-</option>
		</select><br><br>
	项目说明:<input name="content"><br><br>
	<input type="submit" value="添加">
	</form>
</body>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"find.do",
			type:"post",
			data:{},
			dataType:"json",
			success:function(obj){
				for (var i = 0; i < obj.length; i++) {
					$("#s1").append("<option value='"+obj[i].did+"'>"+obj[i].dname+"</option>");
				}
			}
		})
	})
</script>
</html>