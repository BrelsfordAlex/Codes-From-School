<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<body>  
<%--This is how you would print things from a form! --%>
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
<form action="helloworld.jsp">
	<input type="text" name="uaname">  
	<input type="submit" value="go"><br/>  
</form>
</body>  
</html>  