<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--
This is a comment
Tutorial site:https://www.javatpoint.com/jsp-tutorial
This is the first JSP File I have made
After working on somting save then run twice to see the new version
 --%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
			<%out.print(2*5); %><%--This is a simple print statement --%>
		<br>
		<%--
		FORMS IN JSP
		--%>
		 <form action="form.jsp">  
			<input type="text" name="uname">  
			<input type="submit" value="go"><br/>  
		</form> 
	</body>
</html>