<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
	<form action="signup.jsp" method="post">
		<div class="container col-4">
			<div class="form-group">
				<label for="id">아이디</label> <input class="form-control" type="text"
					name="id" id="id" placeholder="Id" /> <small
					class="form-text text-muted">5글자 이상 입력하세요.</small>
			</div>
			<div class="form-group">
				<label for="pwd">비밀번호</label> <input class="form-control"
					type="password" name="pwd" id="pwd" placeholder="Password" />
			</div>

			<fieldset class="form-group">
					<legend class="col-form-label">성별 선택</legend>
					<div class="row">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							value="man" /> <label class="form-check-label">남</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="gender"
							value="woman" /> <label class="form-check-label">여</label>
					</div>
				</div>
			</fieldset>
		</div>
	</form>
</body>
</html>