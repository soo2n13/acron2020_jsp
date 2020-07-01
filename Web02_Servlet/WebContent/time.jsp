<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>time.jsp</title>
</head>
<body>
	<%
		Date date=new Date();
	%>
	<p>현재 시간: <%=date %></p>
	
	<%out.println("<p>안녕하세요.</p>"); %>
	
</body>
</html>