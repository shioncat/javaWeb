<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Porder"%>
  <%
  request.setCharacterEncoding("big5");
  
  String Desk=request.getParameter("desk");
  int A=Integer.parseInt(request.getParameter("A"));
  int B=Integer.parseInt(request.getParameter("B"));
  int C=Integer.parseInt(request.getParameter("C"));
  
  
  Porder p=new Porder(Desk,A,B,C);
  
  session.setAttribute("P", p);//�]�w��session
  %>  
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
		<table width=500 align=center>
		
			<tr>
				<td colspan=2 align=center><h3>�q��ӥ�</h3>
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td width=100 align=center>�ู
				<td><%=p.getDesk() %>
			<tr>
				<td width=100 align=center>A�\
				<td><%=p.getA() %>
			<tr>
				<td width=100 align=center>B�\
				<td><%=p.getB() %>
			<tr>
				<td width=100 align=center>C�\
				<td><%=p.getC() %>
			<tr>
				<td width=100 align=center>�@
				<td><%=p.getSum() %>��
			<tr>
				<td colspan=2>
				<hr>
			<tr>
				<td colspan=2 align=center>
				<a href="addOrderController">�T�w</a>
				<a href="addOrder.jsp">����</a>
		</table>
		
		
		
		
		
		
	<tr height=40>
		<td align=center><jsp:include page="end.jsp"/>
		

</table>
</body>
</html>