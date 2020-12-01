<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
first name : <form:input path="firstName"/>
<br> <br>
last Name : <form:input path="lastName"/>
<br> <br>
<%-- <form:select path="country">
<form:option value="Brazil" label="Brazil"></form:option>
<form:option value="France" label="France"></form:option>
<form:option value="India" label="India"></form:option>
</form:select> --%>
<form:select path="country">
<form:options items="${student.countryOption}"/>
</form:select>


<br> <br>
<input  type="submit" value="submit">
</form:form>



</body>
</html>