<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Courses</title>
    </head>
    <body>
        <table>
                <tr>
                    <th>Name</th>
                </tr>

                <c:forEach items="${courses}" var="courses">
                    <tr>
                        <td>${courses.name}</td>
                    </tr>
                </c:forEach>
        </table>
    </body>
</html>