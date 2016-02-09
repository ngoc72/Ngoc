<%-- 
    Document   : index
    Created on : Feb 3, 2016, 6:19:05 PM
    Author     : Ngoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Welcome back</title>
        <link rel="stylesheet" href="style/styles.css" type="text/css"/>
    </head>
    <body>
        <h1> Welcome back ${user.firstName}</h1>         
        <p>Here is the information:</p>
        <label>Email:</label>
        <span> ${user.email}</span><br>
        <label>First Name:</label>
        <span>${user.firstName}</span><br>
        <label>Last Name:</label>
        <span>${user.lastName}</span><br>
        <p>To enter another email address, click on the Back 
        button in your browser or the Return button shown 
        below.</p>

        <form action="" method="get">
            <input type="hidden" name="action" value="signIn">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
