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


<br>
<h1>Hello my servlet! and hello ${name} </h1>



Enter your credential

<form action="ActionForm" method="Get">
    Login: <input type="text" name="login">
    <bt />
    Pass: <input type="text" name="pass" />
    <input type="submit" value="Submit"/>
</form>

<form action="Action" method="post">
    Connect to DB <button type="submit" name="conDB" value="conDB">ConectDB</button>>
</form>

<br>
You enter login =  ${Login}  and pass =  ${Pass}
</br>
<br>
${dbcon}
</br>
</body>

</html>
