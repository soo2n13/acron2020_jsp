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
	<div class="container">
		<h1>회원가입 폼입니다.</h1>
		<form class="form-group" action="signup.jsp" method="post">
			<div class="input-group col-md-4">
				<div class="input-group-prepend">
					<span class="input-group-text" id="id"> <svg width="1em"
							height="1em" viewBox="0 0 16 16" class="bi bi-person-fill"
							fill="currentColor" xmlns="http://www.w3.org/2000/svg">
	  						<path fill-rule="evenodd"
								d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6z" />
						</svg>
					</span>
				</div>
				<input type="text" class="form-control" placeholder="Username"
					aria-label="Username" aria-describedby="id" name="id" id="id">
				<small class="form-text text-muted">5글자 이상 입력하세요.</small>
			</div>
			<div class="input-group col-md-4">
				<div class="input-group-prepend">
					<span class="input-group-text" id="pwd"> <svg width="1em"
							height="1em" viewBox="0 0 16 16" class="bi bi-hash"
							fill="currentColor" xmlns="http://www.w3.org/2000/svg">
							  <path
								d="M8.39 12.648a1.32 1.32 0 0 0-.015.18c0 .305.21.508.5.508.266 0 .492-.172.555-.477l.554-2.703h1.204c.421 0 .617-.234.617-.547 0-.312-.188-.53-.617-.53h-.985l.516-2.524h1.265c.43 0 .618-.227.618-.547 0-.313-.188-.524-.618-.524h-1.046l.476-2.304a1.06 1.06 0 0 0 .016-.164.51.51 0 0 0-.516-.516.54.54 0 0 0-.539.43l-.523 2.554H7.617l.477-2.304c.008-.04.015-.118.015-.164a.512.512 0 0 0-.523-.516.539.539 0 0 0-.531.43L6.53 5.484H5.414c-.43 0-.617.22-.617.532 0 .312.187.539.617.539h.906l-.515 2.523H4.609c-.421 0-.609.219-.609.531 0 .313.188.547.61.547h.976l-.516 2.492c-.008.04-.015.125-.015.18 0 .305.21.508.5.508.265 0 .492-.172.554-.477l.555-2.703h2.242l-.515 2.492zm-1-6.109h2.266l-.515 2.563H6.859l.532-2.563z" />
						</svg>
					</span>
				</div>
				<input type="password" class="form-control" placeholder="Password"
					aria-label="Username" aria-describedby="pwd" name="pwd" id="pwd">
			</div>

			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-md-2 pt-0">성별 선택</legend>
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
			<div class="row">
				<label class="col-md-2" for="job">직업선택</label><br> 
				<select class="custom-select col-2" id="job" name="job">
					<option value="doctor">의사</option>
					<option value="programer">프로그래머</option>
					<option value="disigner">디자이너</option>
					<option value="etc">등등</option>
				</select>
			</div>
			<fieldset class="form-group">
				<div class="row">
					<legend class="col-form-label col-md-2 pt-0">관심사 선택</legend>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" value="java" name="chk">
						<label class="form-chack-label">자바</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" value="javascript" name="chk">
						<label class="form-chack-label">자바스크립트</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="checkbox" value="css" name="chk">
						<label class="form-chack-label">스타일시트</label>
					</div>
				</div>
			</fieldset>
			<textarea class="form-control col-5" rows="10" cols="10"
				placeholder="하고 싶은말..." name="area"></textarea>
			<br> <input class="btn btn-primary" type="submit" value="전송">
			<input class="btn btn-primary" type="reset" value="취소">
		</form>
	</div>
</body>
</html>