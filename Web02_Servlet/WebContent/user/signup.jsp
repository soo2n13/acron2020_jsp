<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("euc-kr");     
	
	String id=request.getParameter("id");
	String pwd=request.getParameter("pwd");
	
	String gender=request.getParameter("gender");
	
	String job=request.getParameter("job");
	String[] arr=request.getParameterValues("chk");
	String content=request.getParameter("area");
	
	String like="";
	for(String tmp:arr) {
		like+=tmp+" ";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<td><%=id %></td>
		</tr>
		<tr>
			<th>PWD</th>
			<td><%=pwd %></td>
		</tr>
		<tr>
			<th>Gender</th>
			<td><%=gender %></td>
		</tr>
		<tr>
			<th>Job</th>
			<td><%=job %></td>
		</tr>
		<tr>
			<th>Like</th>
			<td><%=like %></td>
		</tr>
		<tr>
			<th>Comment</th>
			<td><%=content %></td>
		</tr>
		
	</table>
</body>
</html>