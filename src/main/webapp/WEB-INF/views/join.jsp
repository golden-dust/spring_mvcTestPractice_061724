<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join As A Member</title>
</head>
<body>
	<h1>Sign Up</h1>
	<hr>
	<fieldset style="width: 400px; padding: 10px; border: white;">
		<form action="joinOk">
			<table>
				<tr>
					<td><label for="memberID">아이디 : </label></td>
					<td><input type="text" name="memberID"></td>
				</tr>
				<tr>
					<td><label for="memberPW">비밀번호 : </label></td>
					<td><input type="password" name="memberPW"></td>
				</tr>
				<tr>
					<td><label for="memberName">이름 : </label></td>
					<td><input type="text" name="memberName"></td>
				</tr>
				<tr>
					<td><label for="memberAge">나이 : </label></td>
					<td><input type="text" name="memberAge"></td>
				</tr>
				<tr>
					<td><label for="memberEmail">이메일 : </label></td>
					<td><input type="text" name="memberEmail"></td>
			</table>
			<div>
				<br>
				<input type="submit" value="가입하기">
			</div>
		</form>
	</fieldset>
</body>
</html>