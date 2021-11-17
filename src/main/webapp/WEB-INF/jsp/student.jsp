<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <title>Courses</title>
        <link href ="main.css" rel= "stylesheet"/>
         </head>
    <body>
        <table>
            <thead>
               <tr>
                  <th>Name</th>
                  <th>SurName</th>
                  <th>Age</th>
                  <th>Actions</th>
               </tr>
            </thead>
            <tbody>
                <c:forEach items="${courses.students}" var="student">
                    <tr>
                         <td>${student.name}</td>
                         <td>${student.surname}</td>
                         <td>${student.age}</td>


                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>