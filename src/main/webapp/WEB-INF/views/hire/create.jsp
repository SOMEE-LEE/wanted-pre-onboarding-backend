<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>채용공고 등록</title>
</head>
<body>
<h1>채용공고 등록</h1>
<form method="post" action="hire_add">
	<p>회사 id: <input type="number" name="companyId" value="1"></p>
	<p>채용 포지션: <input type="text" name="position"></p>
	<p>채용 보상금: <input type="number" name="hireMoney"></p>
	<p>채용내용: <input type="text" name="content"></p>
	<p>사용 기술: <input type="text" name="tool"></p>
	<input type="submit" value="등록하기">
</form>
</body>
</html>