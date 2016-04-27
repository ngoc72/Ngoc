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
        <h1>Room Maintenance</h1>
        <form action="RoomServlet" method="post">  
        <label class="pad_top">Room Id:</label>
        <input type="text" name="roomId" value="${room.roomId}" ><br>
        <label class="pad_top">Room Name:</label>
        <input type="text" name="roomName" value="${room.roomName}"<br>
        <label class="pad_top">Capacity:</label>
        <input type="text" name="capacity" value ="${room.capacity}"><br> 
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp;
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br>

        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
