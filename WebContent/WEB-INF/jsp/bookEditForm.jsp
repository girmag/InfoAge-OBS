<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Book</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form modelAttribute="book"  action= "addBook" method="post">
    <fieldset>
        <legend>Add a book</legend>
        
         
        <p>
            <label for="itemId">Item ID </label>
            <form:input id="itemId" path="itemId"/>
        </p>
        <p>
            <label for="title">Title</label>
            <form:input id="title" path="title"/>
        </p>
        <p>
            <label for="unitPrice">Unit Price</label>
            <form:input id="unitPrice" path="unitPrice"/>
        </p>
         <p>
            <label for="publisher">Publisher </label>
            <form:input id="publisher" path="publisher"/>
        </p>
         <p>
            <label for="yearofPublication">Year Of Publication </label>
            <form:input id="yearofPublication" path="yearofPublication"/>
        </p> 
         <p>
            <label for="edition">Edition </label>
            <form:input id="edition" path="edition"/>
        </p>
         <p>
            <label for="isbn">Isbn </label>
            <form:input id="isbn" path="isbn"/>
        </p>
         <p>
            <label for="author">Author </label>
            <form:input id="author" path="author"/>
        </p>
         <p>
            <label for="category">Category </label>
            <form:input id="category" path="category"/>
        </p>
        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Book">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
