<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="post">
	<table width=400 align=center border=1>
		<tr>
			<td colspan=2 align=center><h3>�|���n�J</h3>
		<tr>
			<td width=100 align=center>�b��
			<td><input type="text" name="username">
		<tr>
			<td width=100 align=center>�K�X
			<td><input type="text" name="password">
		<tr>
			<td colspan=2 align=center>
			<input type="submit" value="�n�J">
			<a href="addMember.jsp">���U</a>
			
	</table>

</form>
</body>
</html>