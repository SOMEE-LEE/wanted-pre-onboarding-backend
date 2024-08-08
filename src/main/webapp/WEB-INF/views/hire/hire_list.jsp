<%@page import="com.pretask.web.model.Company"%>
<%@page import="com.pretask.web.model.Hire"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Hire> list = (List<Hire>)request.getAttribute("list");
	//List<Company> com = (List<Company>)request.getAttribute("com");
%>
<html>
<head>
	<meta charset="UTF-8">
	<title>채용공고 목록</title>
</head>
<body>
<h1>
	채용공고 목록
</h1>
<!--
<p>
	<input type="text" placeholder="검색어를 입력해주세요">
	<input type="button" value="검색">
</p>
-->

<br>
<table border="1">
<tr>
	<td>채용공고 id</td>
	<td>회사 id</td>
	<td>채용포지션</td>
	<td>채용보상금</td>
	<td>사용기술</td>
</tr>
<%for(Hire hire : list) {%>
<tr>
    <td><a href="/web/pretask/hire_detail?idx=<%= hire.getIdx() %>"><%= hire.getIdx() %></a></td>
    <td><%= hire.getCompanyId() %></td>
    <% 
    //for(Company comp : com) { 
    //    if(hire.getCompanyId() == comp.getCompanyId()) {
    	// comp.getCountry()
    	// comp.getRegion()
    %>
    <% 
      //  } 
    //} 
    %>
    <td><%= hire.getPosition() %></td>
    <td><%= hire.getHireMoney() %></td>
    <td><%= hire.getTool() %></td>
</tr>
<%} %>
</table>
<br>
<a href="/web/pretask/hire_add">채용공고 등록</a>
</body>
</html>
