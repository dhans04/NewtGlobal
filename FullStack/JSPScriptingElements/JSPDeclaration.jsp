<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<strong>Hello JSP</strong>
<br/>
<%! public int x=10; %>

<%= x %>
<br/>
<%!
String message(){
return "Hii";
};%>
<%= message() %>
<br/>
</body>
</html>