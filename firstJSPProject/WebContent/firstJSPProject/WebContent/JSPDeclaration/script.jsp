<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<%-- This is an example of using JAVA LIBRARIES --%>
		<%--Field or method declaring --%>
		<%--
			Difference of JSP scriplet (Above) and JSP declarations
			Jsp Scriptlet Tag	
				The jsp scriptlet tag can only declare variables not methods.
				The declaration of scriptlet tag is placed inside the _jspService() method.
			Jsp Declaration Tag
				The jsp declaration tag can declare variables as well as methods.
				The declaration of jsp declaration tag is placed outside the _jspService() method.		
		  --%>
		 <%!int data=50; %><%--The declarations need a ; --%>
		 <%="Value of the variable is: "+ data %> 
		 <br>
		 <%--"This is an example of a JSP declaration of a method" --%>
		 <%!   
			int cube(int n)
			{  
			return n*n*n;  
			}  /**While in these tags Java comments work!*/
		%>
		
		<%="using the method cube. The Cube of 3 is:"+ cube(3) %>
		<br>
		
	</body>
</html>