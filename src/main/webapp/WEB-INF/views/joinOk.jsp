<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join OK</title>
</head>
<body>
	<h1>회원 가입 완료</h1>
	<hr>
	<p>
	<!-- 
		[가입하신 회원 정보]<br>
		아이디 : ${mid}<br>
		비밀번호 : ${mpw}<br>
		이름 : ${mname}<br>
		나이 : ${mage}<br>
		이메일 : ${memail}
		 -->
		[가입하신 회원 정보]<br>
		아이디 : ${member.getMemberID()}<br>
		비밀번호 : ${member.getMemberPW()}<br>
		이름 : ${member.getMemberName()}<br>
		나이 : ${member.getMemberAge()}<br>
		이메일 : ${member.getMemberEmail()}
	</p>
</body>
</html>