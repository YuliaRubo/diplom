<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <title>Courses</title>
        <link href ="main.css" rel= "stylesheet"/>
        <body>

         <form:form method="POST" action="/save-courses"
           modelAttribute="courses">
             <form:label path="name">Name</form:label>
             <form:input path="name" value="${courses.name}"/>

             <form:label path="id" cssStyle = "display:none">Id</form:label>
             <form:input path="id" cssStyle = "display:none" value="${courses.id}"/>

             <input type="submit" value="Submit" />
         </form:form>
           </body>
           </html>
