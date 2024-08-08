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
<title>채용공고 상세 페이지</title>
</head>
<body>
<h1>채용공고 상세 페이지</h1>
	<p>회사명: <%= hire.getCompanyId() %></p>
	<p>국가: </p>
	<p>지역: </p>
	<p>채용 포지션: <%= hire.getPosition() %></p>
	<p>채용 보상금: <%= hire.getHireMoney() %></p>
	<p>채용내용: <%= hire.getContent() %></p>
	<p>사용 기술: <%= hire.getTool() %></p>
	
	<br>
	<a href="/web/pretask">채용공고 목록</a>
	<a href="hire_edit?idx=<%=hire.getIdx()%>">채용공고 수정</a>
	<a href="hire_delete?idx=<%=hire.getIdx()%>">채용공고 삭제</a>
</body>
</html>