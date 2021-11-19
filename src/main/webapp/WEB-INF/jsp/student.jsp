<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
    <head>
        <title>Courses</title>
        <link href ="student.css" rel= "stylesheet"/>
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
                         <td><a href="http://Localhost:8080/get-all-courses"><input type="button" value = "Courses"></a></td>
                         <td><a href="http://Localhost:8080/add-new-student"><input type="button" value = "Add"></a></td>
                         <td><a href="http://Localhost:8080/update-student?id=${student.id}"><input type="button" value = "Update"></a></td>
                         <td><a href="http://Localhost:8080//delete-student?id=${student.id}"><input type="button" value = "Delete"></a></td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>