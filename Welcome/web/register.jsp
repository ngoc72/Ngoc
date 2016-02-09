<%-- 
    Document   : register
    Created on : Feb 3, 2016, 6:42:10 PM
    Author     : Ngoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration page</title>
        <link rel="stylesheet" href="style/styles.css" type="text/css"/>
    </head>
    <body>
        <h1> Registration</h1>

        <p>To register, enter your name and email
        address below. Then, click on the Submit button.</p>

        <form action="WelcomeServlet" method="post">
        <input type="hidden" name="action" value="registerUser">        
        <label class="pad_top">Email:</label>
        <input type="email" name="email" required><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" required><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" required><br>
        <label>&nbsp;</label>
        <input type="submit" value="Join Now" class="margin_left">

    </body>
</html>
