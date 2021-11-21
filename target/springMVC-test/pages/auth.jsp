<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 09.10.2021
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Authorization</title>
</head>
<body>
<s:form method="post" action="/user/auth" modelAttribute="authUser">
    <s:input path="username" placeholder="Username"/>
    <s:errors path="username"/>
    <s:input type="password" path="password" placeholder="Password"/>
    <s:errors path="password"/>
    <s:button>Submit</s:button>
</s:form>



</body>
</html>
