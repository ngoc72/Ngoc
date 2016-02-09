<%-- 
    Document   : login
    Created on : Feb 3, 2016, 7:17:55 PM
    Author     : Ngoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Welcome </title>
        <link rel="stylesheet" href="style/styles.css" type="text/css"/>
    </head>
    <body>
        <h1> Welcome to this page, please sign in. </h1>
        <form action="WelcomeServlet" method="get">
            
            <input type="hidden" name="action" value="checkUser">  
             <label class="pad_top">Email:</label>
            <input type="email" name="email" required><br>
           
            <label>&nbsp;</label>
            <input type="submit" value=" Sign in" > 
        </form>
    </body>
</html>
