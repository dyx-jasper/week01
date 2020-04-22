<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<table>
		
		<tr>
			<td>编号</td>
			<td>英雄名称</td>
			<td>价格</td>
			<td>是否拥有</td>
			<td>图片</td>
			<td>所属阵营</td>
			<td>操作</td>
		</tr>
		
	<c:forEach items="${list }" var="h">
		<tr>
			<td>${h.id }</td>
			<td>${h.hname }</td>
			<td>${h.price }</td>
			<td>${h.isHave==0?"未拥有":"已拥有" }</td>
			<td>
				<img alt="xxx" height="70px" width="90px" src="lookImg?path=${h.picurl }">
			</td>
			<td>${h.cname }</td>
			
		</tr>
	</c:forEach>
		
		
	</table>

		
</body>
</html>