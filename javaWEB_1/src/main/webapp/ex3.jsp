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
���:<%=d %><br>
�~:<%=d.getYear()+1900 %><br>
��:<%=d.getMonth()+1 %><br>
��:<%=d.getDay() %><br>
��:<%=d.getDate() %>


</body>
</html>