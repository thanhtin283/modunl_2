<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/27/2019
  Time: 3:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Dictionary</title>
    <link rel="sylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Vietnamese Dictionary</h2>
  <form method="post" action="/translate">
    <input type="text" name="txtSearch" placeholder="Enter your word: "/>
    <input type="submit" id="submit" value="Search"/>
  </form>
  </body>
</html>
