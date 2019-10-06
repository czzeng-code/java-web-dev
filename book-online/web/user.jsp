<%@ page import="com.bo.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: ZENG
  Date: 2019/10/5
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <style type="text/css">
        .explore {
            display: flex;
            align-items: center;
            justify-content: space-between;
            background-color: rgb(237, 244, 237);
            height: 80px;
            padding-left: 8%;
            padding-right: 10px;
        }

        .nav1 {
            display: flex;
            align-items: center;
            list-style: none;
        }

        .nav2 {
            display: block;
            align-items: center;
            list-style: none;
        }

        .nav2 li {
            color: rgb(61, 133, 73);
            font-family: "Microsoft YaHei UI";
            font-size: 18px;
            margin-bottom: 30px;
        }

        .nav1 li {
            color: rgb(61, 133, 73);
            font-size: 18px;
            margin-right: 20px;
        }

        .search-input {
            flex: 0 0 30%;
            height: 35px;
            background-color: #fff;
            border: none;
            border-radius: 3px;
            margin-left: 50px;
            color: rgb(187, 187, 202);
            font-size: 16px;
        }

        .info {
            display: flex;
        }

        .col-8 img {
            width: 90%;
        }
    </style>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    pageContext.setAttribute("user", user);
%>

<%--顶部区域，引入共用的top.jsp页面--%>
<div id="top">
    <jsp:include page="top.jsp"/>
</div>

<div class="explore">
    <ul class="nav1">
        <li>首页</li>
        <li>榜单</li>
        <li>书评</li>
        <li>精品·免费</li>
        <li>客户端</li>
        <li>论坛</li>
    </ul>
    <label>
        <input type="text" placeholder="搜索你感兴趣的内容" class="search-input">
    </label>
</div>
<br>

<%--主体--%>
<div class="container">
    <div class="row">
        <div class="col-4">

            <div class="info">
                <img src="images/${user.avatar}" alt="" class="profile">
                <h2>${user.nickname}</h2>
            </div>

            <ur class="nav2">
                <li>我的书架</li>
                <li>我的收藏</li>
                <li>我的购书劵</li>
                <li>我的赠书</li>
                <li>书币中心</li>
                <li>我的余额</li>
                <li>账号设置</li>
            </ur>
        </div>

        <div class="col-8">
            <img src="img/tushu.png" alt="">
        </div>
    </div>
</div>

<footer>
    <ur>
        <li>@2015-2019</li>
        <li>niit.edu.cn, </li>
        <li>all rights reserved</li>
        <li>南工院计软院</li>
    </ur>
    <ul>
        <li>联系我们</li>
        <li>帮助中心</li>
        <li>法律声明</li>
        <li>移动合作</li>
    </ul>
</footer>
</body>
</html>
