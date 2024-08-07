<%@page import="com.pretask.web.model.Hire"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Hire> list = (List<Hire>)request.getAttribute("list");
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>채용공고 목록 가져오기</title>
</head>
<body>
<h1>
	채용공고 목록 가져오기
</h1>
<P>  This is hire_home </P>
<table border="1">
<tr>
	<td>채용공고 id</td>
	<td>회사명</td>
	<td>국가</td>
	<td>지역</td>
	<td>채용포지션</td>
	<td>채용보상금</td>
	<td>사용기술</td>
	<td>
</tr>
<%for(Hire hire : list) {%>
<tr>
<td><%=hire.getIdx() %></td>
<td><%=hire.getCompanyId() %>회사명</td>
<td>국가</td>
<td>지역</td>
<td><%=hire.getHireMoney() %></td>
<td><%=hire.getPosition() %></td>
<td><%=hire.getTool() %></td>
</tr>
<%} %>
</table>
<br>
<a href="pretask/hire_add">채용공고 등록</a>
</body>
</html>
