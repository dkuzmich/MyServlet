<%--
  Created by IntelliJ IDEA.
  User: dkuzmich
  Date: 3/29/2017
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyTestServlet</title>
</head>


<body>
<h1>Hello my servlet! and hello ${name} </h1>
you enter name ${first_name}
<form action="ActionForm" method="Get">
    First name: <input type="text" name="first_name">
    <bt />
    Last name: <input type="text" name="last_name" />
    <input type="submit" value="Submit"/>
</form>
<form action="CheckBox" method="Get" target="_blank">
    <input type="checkbox" name="maths" checked="checked"/> Match
    <input type="checkbox" name="Physic"/> Physics
    <input type="submit" value="select Subject">
</form>
</body>

</html>
