<%@page import="com.pretask.web.model.Hire"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Hire hire = (Hire)request.getAttribute("hire");
%>
<html>
<head>
<meta charset="UTF-8">
<title>채용공고 수정 페이지</title>
</head>
<body>
<h1>채용공고 수정 페이지</h1>
	<form method="post" action="hire_edit">
		<!-- form에서는 get,post 메서드만 지원함 -->
		<input type="hidden" value="<%= hire.getIdx() %>" name="idx">
		<p>회사명: <input type="text" value="<%= hire.getCompanyId() %>" disabled></p>
		<p>채용 포지션: <input type="text" value="<%= hire.getPosition() %>" name="position"></p>
		<p>채용 보상금: <input type="text" value="<%= hire.getHireMoney() %>" name="hireMoney"></p>
		<p>채용내용: <input type="text" value="<%= hire.getContent() %>" name="content"></p>
		<p>사용 기술: <input type="text" value="<%= hire.getTool() %>" name="tool"></p>
		
		<br>
		<input type="submit" value="채용공고 수정 완료">
	</form>
</body>
</html>