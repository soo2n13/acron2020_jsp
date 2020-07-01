<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.css" />
</head>
<body>
	<%
	request.setCharacterEncoding("euc-kr");
	
	String id=request.getParameter("id");
	String pw=request.getParameter("pw");
	
	if(id.equals("gura") && pw.equals("1234")) {
	%>
		<p class="alert alert-success"><%=id %>님이 로그인 하였습니다.</p>
	<%
	}
	else {
	%>
		<p class="alert alert-danger">로그인에 실패하였습니다.</p>
	<%
	}
	%>
	
</body>
</html>