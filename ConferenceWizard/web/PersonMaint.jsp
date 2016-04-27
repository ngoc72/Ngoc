<%-- 
    Document   : CatMaint
    Created on : Mar 23, 2016, 10:13:05 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Person Maintenance</h1>
        <form action="PersonServlet" method="post">  
        <label class="pad_top">Person Id:</label>
        <input type="text" name="personId" value="${person.personId}" ><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" value="${person.firstName}"
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" value="${person.lastName}"
        <label class="pad_top">Title:</label>
        <input type="text" name="title" value="${person.title}"<br>
        <label class="pad_top">Phone:</label>
        <input type="text" name="phone" value ="${person.phone}"><br>
        <label class="pad_top">Email:</label>
        <input type="text" name="email" value ="${person.email}"><br>   
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp;
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br>

        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
