<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="rock.learning.util.AttributesName" %>
<html>
<head>
    <title>Add Items</title>
</head>
<body>

<div align="center">
    <form:form method="POST" modelAttribute="${AttributesName.TODO_ITEM}">
        <table>
            <tr>
                <td><label for="id">ID</label></td>
                <td><form:input path="id" disabled="true"/></td>
            </tr>
            <tr>
                <td><label for="title">Title</label></td>
                <td><form:input path="title"/></td>
            </tr>
            <tr>
                <td><label for="deadline">Deadline</label></td>
                <td><form:input path="deadline"/></td>
            </tr>
            <tr>
                <td><label for="details">Details</label></td>
                <td><form:textarea path="details"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>
