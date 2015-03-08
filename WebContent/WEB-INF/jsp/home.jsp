<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Info Age online book store</title>
</head>
<body>
<h1 style="color:green">Welcome to InfoAge Book Store!!</h1>

<p >
             <spring:url value="/login" var="logInUser_url" >
             <spring:param name="ISBN" value="1234"/>
             </spring:url>
             <a href="${logInUser_url}">Sign In</a><br/>
             </p>
             
             <p>
              <spring:url value="/customers" var="regCustomer_url" >
             <spring:param name="ISBN" value="1234"/>
             </spring:url>
             <a href="${regCustomer_url}">Sign Up</a><br/>
        </p>
        
        
        
</body>
</html>