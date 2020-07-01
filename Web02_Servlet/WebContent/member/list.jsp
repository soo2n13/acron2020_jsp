<%@page import="test.dao.MemberDao"%>
<%@page import="test.dto.MemberDto"%>
<%@page import="java.util.List"%>
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
		List<MemberDto> dto=MemberDao.getInstance().select();
	%>
	<table class="table -sm">
		<tr>
			<th scope="col">번호</th>
			<th scope="col">이름</th>
			<th scope="col">주소</th>
		</tr>
		<%for(MemberDto tmp:dto) { %>
			<tr>
				<td><%=tmp.getNum() %></td>
				<td><%=tmp.getName() %></td>
				<td>><%=tmp.getAddr() %></td>
			</tr>
		<%} %>
	</table>
</body>
</html>