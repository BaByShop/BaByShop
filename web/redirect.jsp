<%-- 
    Document   : redirect.jsp
    Created on : Mar 21, 2014, 3:44:26 PM
    Author     : Sarah.Mohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
    <%@ page import= "JavaBeans.Product" %> 
    <jsp:useBean id ="newProduct" class ="JavaBeans.Product"  scope="request"/>
    <jsp:setProperty name= "newProduct" property="*" /> 
    <jsp:forward page="AddProductServlet"/>
    </body>
</html>
