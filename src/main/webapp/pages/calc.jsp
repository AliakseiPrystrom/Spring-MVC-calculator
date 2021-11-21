<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 09.10.2021
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Calc</title>
</head>
<body>
<s:form method="post" action="/operation/calc" modelAttribute="newOperation">
    <s:input type="number" path="num1" placeholder="Num 1"/>
    <s:input type="number" path="num2" placeholder="Num 2"/>
    <s:input type="text" path="operation" placeholder="Operation"/>
    <s:button>Submit</s:button>
</s:form>
<p>${result}</p>

</body>
</html>
<%--<form action="/operation/calc" method="post">--%>
<%--    <input type="number" name="num1" placeholder="Num1">--%>
<%--    <input type="number" name="num2" placeholder="Num2">--%>
<%--    <input type="text" name="operation" placeholder="Operation">--%>
<%--    <button>Submit</button>--%>
<%--</form>--%>