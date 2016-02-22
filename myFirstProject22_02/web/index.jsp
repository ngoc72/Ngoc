<%-- 
    Document   : index
    Created on : Feb 17, 2016, 9:35:30 AM
    Author     : Ngoc
--%>

<%@page import="java.util.GregorianCalendar, java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss.css" type="text/css"/>
        <title> Index page</title>
    </head>
    <body>
        <h1> Welcome to my page </h1>
        <h2> Sign in to your account </h2>
        <form action ="servletPage" method ="get">
            <input type ="hidden" name ="action" value ="checkUser"
            <label>Email address: </lable>
            <input type ="email" name ="email" required > <br>
            <input type ="submit" value ="Sign in" >
        </form>
        <h2> New user?</h2>
        <form action = "servletPage" method = "get">
            <input type ="hidden" name ="action" value ="createAcount">
            <input type ="submit" value =" Create account">
            
        </form>
        <h1>Latest News</h1>
        <ul>
            <li><emp>Java Capstone Presentations</emp> on Wednesday, February 24, at 12 pm at Highland Business Center (5930 Middle Fiskville Road, Austin TX 78752). room 301.0.</li>

            <li>Java Programming 3 course will  end  on March 7th <br /><a href="http://continue.austincc.edu/catalog/courses.php?name=Java%20Programming%203&topic=Java%20Certification&loc=HBC">Read more</a></li>
        </ul>
        <h1>Useful Links</h1>
        <ul>
          <li><a href="http://continue.austincc.edu/">Austin Community College - Continuing Education</a></li>
          <li><a href="http://www.java2s.com/">Programming Tutorials</a></li>
          <li><a href="http://www.tutorialspoint.com/java/"> Learn Java Programming</a></li>
		  
        </ul>
        
    <div id="footer">
       <%
            GregorianCalendar currentDate = new GregorianCalendar();
            int currentYear = currentDate.get(Calendar.YEAR);

         %>
         <p> &copy; Copyright <%=currentYear %> by Ngoc Hoang </p> 
    </div>   
    </body>
</html>
