<%-- 
    Document   : output
    Created on : 30 Jun 2024, 12:32:03 PM
    Author     : Jeanette
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>greetings Page</title>
    </head>
    <body>
        <h1>Greetings!</h1>
        
        <%
        String name = (String)request.getAttribute("name");
        
         String title = (String)request.getAttribute("title");
        
        %>
        
        <p>Hi <%=title%> <%=name%> welcome to the world of web development.</p>
        
        <p>Click <a href="index.html">here</a> to go back to the main page.</p>
        
    </body>
</html>
