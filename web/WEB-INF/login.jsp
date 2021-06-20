<%-- 
    Document   : loginjsp
    Created on : Jun 17, 2021, 7:06:24 PM
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
        <h1>Login</h1>
        <form method="post" action="note">
        <label>Username:</label>
            <input type="text" name="username" value="${user.username}" > 
            <br>
             <label>Password:</label>
             <input type="text" name="password" value="${user.password}"> 
             <br>
             <input type="submit" value="Log in">
        </form>
 <c:if test="${invalid}">
            <p>Invalid login.</p>
        </c:if>
    </body>
</html>
