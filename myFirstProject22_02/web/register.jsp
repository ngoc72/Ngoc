<%-- 
    Document   : register
    Created on : Feb 17, 2016, 10:39:30 AM
    Author     : Ngoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss.css" type="text/css"/>
        <title> Register Page</title>
    </head>
    <body>
        <h1> You have not registered yet. To Register, please enter your information:  </h1>
        <form action ="servletPage" method="post">
            <input type ="hidden" name ="action" value ="registerUser">
            <label> First name:  </label>
            <input tupe ="text" name ="firstName" required> <br>
            <label> Last name: </label>
            <input type ="text" name ="lastName" required> <br>
            <label> Email address: </label>
            <input type ="email" name ="email" required> <br>
            <input type ="submit" value ="join now">
        </form>
    </body>
</html>
