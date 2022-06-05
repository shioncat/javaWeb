<%@ page 
language="java" 
contentType="text/html; charset=BIG5"
pageEncoding="BIG5"
import="java.util.Date"

%>

<%!
int x=10;
int cal(int x,int y)
{
	return x*y;
}

%>
<%
out.println(x+cal(5,2)+"<br>");

Date d=new Date();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>ex3</title>
</head>
<body>
<%@include file="title.jsp" %>


<hr>
5*3=<%=cal(5,3) %><br>
日期:<%=d %><br>
年:<%=d.getYear()+1900 %><br>
月:<%=d.getMonth()+1 %><br>
日:<%=d.getDay() %><br>
日:<%=d.getDate() %>


</body>
</html>