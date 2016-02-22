<%-- 
    Document   : welcome
    Created on : Feb 17, 2016, 12:44:07 PM
    Author     : Ngoc
--%>
<%-- 
<%@ page import "servlet.User"%>
<%
     user = (User)request.getAtribute("user")
    if (user==null){user = new User();}
%>
<%=User.getFirstname()--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss.css" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Welcome to my page, ${userz.firstName} </h2>
       
        
        <h1> My Biography</h1>
        <table>
		<tr>
			<td><b>Early life</b><br>
			- Was born in Da Lat in 1972, a famous city of Vietnam country. <br>
			- Graduated high school at Luong Van Can High School in Ho Chi Minh city of Vietnam.</td>
			<td><img class="right" src="style/country.gif" alt="Da Lat" style="width:200px">	</td>
		</tr>
		<tr>
			<td><img class="left" src="style/family.gif" alt="Family" style="width:200px"></td>
			<td><b>Family life </b><br>
		
			- Got married with a talent man in 1997, had two kids – both girls. One is in high school and the other is in middle school.<br>
			-  The family migrated to The U.S in 2014. </td>
		</tr>
		<tr>
			<td>
			<p><b>Major accomplishment</b><br>
		
			- Achieved a bachelor degree in Mathematics in 1994 and then master degree in that in 2007.<br>
			- Being ranked as an excellent high school math teacher during teaching time 1998 to 2014 in Vietnam.
			</p></td>
			<td><img class = "right" src="style/book.gif" alt="book" style=" width:220px;"></td>
		</tr>
		
	</table>
        <a href ="/index.jsp"> Return to Index page </a>
    
    </body>
</html>
