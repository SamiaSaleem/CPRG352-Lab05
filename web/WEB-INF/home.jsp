<%-- 
    Document   : home
    Created on : Jun 17, 2021, 7:07:10 PM
    Author     : 816386
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
            <p> Hello ${user.username}</p>
                   <a href="login?login.jsp">Log out</a>

    </body>
</html>
