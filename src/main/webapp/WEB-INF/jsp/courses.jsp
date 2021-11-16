<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>View Books</title>
         </head>
    <body>
        <table>
            <thead>
               <tr>
                  <th>Name</th>
               </tr>
            </thead>
            <tbody>
                <c:forEach items="${courses}" var="courses">
                    <tr>
                         <td>${courses.name}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>