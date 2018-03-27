<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>全选</td>
			<td>编号</td>
			<td>名称</td>
			<td>时间</td>
			<td>种类</td>
			<td>分布</td>
		</tr>
		<c:forEach var="a" items="${aList }">
			<tr>
				<td><input type="checkbox"></td>
				<td>${a.aid }</td>
				<td>${a.aname }</td>
				<td>${a.datea }</td>
				<td>${a.disname }</td>
				<td>${a.disname }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>