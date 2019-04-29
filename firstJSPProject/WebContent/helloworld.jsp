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
<title>first JSP file</title>
</head>
<body>
<%--
You cannot have paragraph form with <% %> commands

 --%>
	<p>
	Hello World <br>
	</p>
	<%out.print(2*5); %><%--This is a simple print statement --%>
	<br>
	<%--
	FORMS IN JSP
	
	 <form action="FormAction.jsp">  
		<input type="text" name="uname">  
		<input type="submit" value="go"><br/>  
	</form>  
	<%  
	String aname=request.getParameter("uaname");  
	out.print("Hi! "+aname);  
	%>  
	
	
	<%-- Expression Tags --%>
	<%= " an expression tag does not need a ; " %>
	<br>
	Current Time:<%= java.util.Calendar.getInstance().getTime() %>
	<br>  <%--need this for new line --%>
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
	
	<!-- HTML COMMENTS WORK  -->
	<%-- JSP implicit objects --%>
		<!--Implicit Object out -->	
			<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
			<br>
		<!-- Implicit Object Request -->	
</body>
</html>