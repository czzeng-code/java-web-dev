<%--
  Created by IntelliJ IDEA.
  User: ZENG
  Date: 2019/9/12
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    <h2>首页</h2>
    <h2>欢迎你：<%=request.getAttribute("username")%></h2>
    <ul>
        <li>
            <a href="person.jsp">个人中心</a>
        </li>

        <li>
            客户端
        </li>
    </ul>
    <h2>欢迎您：<%=request.getAttribute("username")%></h2>
    <a href="login.html">点击返回登陆</a>
  </body>
</html>
