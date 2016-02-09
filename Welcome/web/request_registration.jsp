<%-- 
    Document   : request_registration
    Created on : Feb 3, 2016, 6:46:26 PM
    Author     : Ngoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Request_reg page </title>
    </head>
    <body>
        <h1> You have not registered. Please click on the Register button below</h1>
        <form action="WelcomeServlet" method="post">
                   
            <label>&nbsp;</label>
            <input type="submit" value="Register" class="margin_left">
        </form>
    </body>
</html>
