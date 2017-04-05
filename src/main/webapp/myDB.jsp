
<%@ page import= "java.sql.*, java.io.* " %>

import java.io.PrintWriter;
import java.sql.*;

<%--
  Created by IntelliJ IDEA.
  User: dkuzmich
  Date: 4/4/2017
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DB info page</title>
</head>
<body>
<H1>Hello on DB status page</H1>
<%!
    static final String Url = "jdbc:mysql://localhost/testsh";
    static final String User = "root";
    static final String Pass = "12345";
    ResultSet res ;
          public  void  contoDB() {
              try {

                  Class.forName("com.mysql.jdbc.Driver");

                  Connection con = DriverManager.getConnection("URL", "User", "Pass");
                  Statement stm = con.createStatement();
                  String SQL = "Select * FROM srvdb";
                  res = stm.executeQuery(SQL);
                  while (res.next()) {
                      Integer id = res.getInt("ID");
                      String name = res.getString("Name");
                      String pass = res.getString("Pass");
                      System.out.println("id= " + id + " name= " + name + " pass= " + pass);
                  }
              } catch (SQLException e) {
                  e.printStackTrace();
              } catch (ClassNotFoundException e) {
                  e.printStackTrace();
              }
          }


%>

<table border="1">
    <Tr>
        <TH>ID</TH>
        <TH>Name</TH>
        <TH>Pass</TH>
    </Tr>

    <% while (res.next()){%>
    <TR>
        <TD><%=res.getInt("ID") %></TD>
        <TD><%=res.getString("sName") %>> </TD>
        <TD><%=res.getString("sPass") %>> </TD>
    </TR>

    <%}%>
</table>


</body>
</html>
