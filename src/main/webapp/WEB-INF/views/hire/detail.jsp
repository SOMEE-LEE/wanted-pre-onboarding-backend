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
	<p>회사 id: <%= hire.getCompanyId() %></p>
	<p>채용 포지션: <%= hire.getPosition() %></p>
	<p>채용 보상금: <%= hire.getHireMoney() %></p>
	<p>채용내용: <%= hire.getContent() %></p>
	<p>사용 기술: <%= hire.getTool() %></p>
</body>
</html>