<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Book List</title>
<style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<h1>Book List</h1>

<!-- Query Parameter passing (Avoids XSS injection attack  PLUS - URL encoding) -->
<spring:url value="/addBook" var="addBook_url" >
<spring:param name="ISBN" value="1234"/>
</spring:url>
<a href="${addBook_url}">Add Book</a><br/>

 
 
<table>
<tr>
   
    <th>Title</th>
    <th>ISBN</th>
    <th>Author</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${books}" var="book">
    <tr>
       
        <td>${book.title}</td>
        <td>${book.isbn}</td>
        <td>${book.author}</td>
        
        <spring:url value="/book_edit/{id}"  var="edit" >
   				<spring:param name="id" value="${book.id}" />
 		</spring:url>
         
        <td><a href="${edit}">Edit</a></td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>
