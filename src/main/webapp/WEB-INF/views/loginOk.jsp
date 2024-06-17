<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>
	<h1>로그인 성공</h1>
	<hr>
	${user } 님,
	<p>
		로그인하신 아이디는 ${login_id }이고<br>
		로그인하신 비밀번호는 ${login_pw }입니다.
	</p>
	<hr>

</body>
</html>