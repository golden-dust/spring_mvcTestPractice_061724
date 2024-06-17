<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Login</title>
<style>
	label {
		text-align: right;
	}
</style>
</head>
<body>
	<h1>회원 로그인</h1>
	<hr>
	<fieldset style="width: 300px; border: white; padding: 10px;">
		<form action="loginOk">
			<table>
				<tr>
					<td><label for="memberID">아이디 : </label></td>
					<td>
						<input type="text" name="memberID">
					</td>
				</tr>
				<tr>
					<td><label for="memberPW">비밀번호 : </label></td>
					<td>
						<input type="password" name="memberPW">
					</td>
				</tr>
			</table>
			<div>
				<br>
				<input type="submit" value="로그인">
			</div>
		</form>
	</fieldset>
</body>
</html>