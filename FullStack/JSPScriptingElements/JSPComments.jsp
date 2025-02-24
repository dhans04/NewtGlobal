<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<strong>Hello JSP</strong>
<br/>
<!-- 
<%
	int x=25;
	//though we use html comment the x value is displayed as 25 
	//this is beacouse only the printable statement only not executed other than that everything will get executed like assignment,redirection
	out.print("The value of x :");
	out.print(x);
	response.sendRedirect("www.google.com");
%>
 -->
<br/>

<%= x %>
<%--
	int y=25;
	//though we use html comment the x value is displayed as 25 
	//this is beacouse only the printable statement only not executed other than that everything will get executed like assignment,redirection
	out.print("The value of y :");
	out.print(y);
	response.sendRedirect("www.google.com");
--%>
<br/>
</body>
</html>