<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>

<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="title.jsp"/>
	<tr height=500>
		<td align=center>
		<form action="confirm.jsp" method="post">
			<table width=510 align=center border=0>
				<tr>
					<td colspan=3>
					�ู
					<select name="desk">
						<option value="A��">A��
						<option value="B��">B��
						<option value="C��">C��
						<option value="D��">D��					
					</select>
				
				<tr>
					<td colspan=3>
					<hr>
					
				<tr>
					<td width=170 align=center valign="top">
					A�\
					<img alt="1" src="pic/1.jpg">
					<select name="A">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9
					</select>
					
					
					<td width=170 align=center valign="top">
					B�\
					<img alt="2" src="pic/2.jpg">
					<input type="number" name="B">
					
					
					<td width=170 align=center valign="top">
					C�\
					<img alt="3" src="pic/3.jpg">
					<select name="C">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9
					</select>
				<tr>
					<td colspan=3>
					<hr>
				<tr>
					<td colspan=3 align=center>
					<input type="submit" value="ok">
					<a href="index.jsp">�W�@��</a>
			
			</table>	
		
		</form>		
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>

</table>

</body>
</html>