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
                  <th>Courses</th>
                  <th>Actions</th>
               </tr>
            </thead>
            <tbody>
                <c:forEach items="${courses}" var="courses">
                    <tr>
                         <td>${courses.name}</td>
                         <td><a href="http://Localhost:8080/get_courses_with_student?id=${courses.id}"><input type="button" value = "Student"></a></td>
                         <td><a href="http://Localhost:8080/add-new-courses"><input type="button" value = "Add"></a></td>
                         <td><a href="http://Localhost:8080/update-courses?id=${courses.id}"><input type="button" value = "Update"></a></td>
                         <td><a href="http://Localhost:8080//delete?id=${courses.id}"><input type="button" value = "Delete"></a></td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>