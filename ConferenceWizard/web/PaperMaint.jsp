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
        <h1>Catalog Maintenance</h1>
        <form action="CatMaintServlet" method="post">  
        <label class="pad_top">Item Id:</label>
        <input type="text" name="itemId" value="${catalog.itemId}" ><br>
        <label class="pad_top">Item Name:</label>
        <input type="text" name="itemName" value="${catalog.itemName}"<br>
        <label class="pad_top">Price:</label>
        <input type="text" name="itemPrice" value ="${catalog.price}"><br>
        <label class="pad_top">Description:</label>
        <input type="text" name="itemDesc" value ="${catalog.itemDesc}"><br>   
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp;
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br>

        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
