<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Porder"
    import="Dao.porderDao"%>

<%
Porder p=(Porder)session.getAttribute("P");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<SCRIPT LANGUAGE="JavaScript">

<!-- This script and many more are available free online at -->
<!-- The JavaScript Source!! http://javascript.internet.com -->

<!-- Begin
function varitext(text){
text=document
print(text)
}
//  End -->
</script>

</head>
<body>

<table width=650 align=center border=1>
	<tr height=80>
		<td align=center><jsp:include page="title.jsp"/>
	<tr height=500>
		<td align=center>
	
		
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>�q�槹��</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>�ู
				<td align=center><%=p.getDesk() %>
			<tr>
				<td width=100 align=center>A�\
				<td align=center><%=p.getA() %>
			<tr>
				<td width=100 align=center>B�\
				<td align=center><%=p.getB() %>
			<tr>
				<td width=100 align=center>C�\
				<td align=center><%=p.getC() %>
			<tr>
				<td width=100 align=center>�@
				<td align=center><%=p.getSum() %>��
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<DIV ALIGN="CENTER">
					<FORM>
						<INPUT NAME="print" TYPE="button" VALUE="�C�L����" ONCLICK="varitext()">
					</FORM>
				</DIV>				
				
				
				<a href="index.jsp">�^����</a>
		</table>
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>

</table>
</body>
</html>