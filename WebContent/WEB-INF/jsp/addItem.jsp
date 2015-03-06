<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>add Item</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form modelAttribute="Book"  action= "addItem" method="post">
    <fieldset>
        <legend>Add an Item</legend>
        <p>
            <label for="category"><spring:message code="book.category" /> </label>
             <form:select id="category" path="category.id" 
                items="${categories}" itemLabel="name" itemValue="id"/>
        </p>
         
        <p>
            <label for="title"><spring:message code="book.title" /> </label>
            <form:input id="title" path="title"/>
        </p>
        <p>
            <label for="author">Author: </label>
            <form:input id="author" path="author"/>
        </p>
        <p>
            <label for="isbn">ISBN: </label>
            <form:input id="isbn" path="isbn"/>
        </p>
        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Book">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
