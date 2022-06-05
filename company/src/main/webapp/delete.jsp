<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.memberDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="deleteController" method="post">
<table width=400 align=center>
	<tr>
		<td>
		ID<input type="text" name="id">
		<input type="submit" value="ok">

</table>
<hr>
	<table width=400 align=center border=1>
		<tr>
			<td>id<td>name<td>username<td>password
		<%
			out.println(new memberDao().queryAll());
		%>
	
	</table>
</form>
</body>
</html>