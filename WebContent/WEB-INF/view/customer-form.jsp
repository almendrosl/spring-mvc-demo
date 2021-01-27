<%--
  Created by IntelliJ IDEA.
  User: aluca
  Date: 26/01/2021
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color:red}
    </style>
</head>
<body>

Fill out the form. Asterisk (*) means required.

<br><br>

<form:form action="processFormCustomer" modelAttribute="customer">

    First Name: <form:input path="firstName"/>

    <br><br>

    Last Name (*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>

    <br><br>

    Free passes: <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>


    <br><br>

    Postal Code: <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>


    <br><br>

    Course Code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>


    <br><br>


    <input type="submit" value="Submit">
</form:form>

</body>
</html>
