<%@ page import="java.util.List" %>
<%@ page import="com.bo.entity.Book" %><%--
  Created by IntelliJ IDEA.
  User: ZENG
  Date: 2019/9/28
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <style type="text/css">
        h2, h3 {
            color: rgb(73, 73, 73);
        }

        #search {
            height: 80px;
            background-color: rgb(246, 246, 241);
            display: flex;
            align-items: center;
            padding-left: 8%;
            margin-bottom: 10px;
        }

        search-input {
            flex: 0 0 40%;
            height: 38px;
            background-color: #fff;
            border: none;
            border-radius: 3px;
            margin-left: 50px;
        }

        .search-btn {
            width: 35px;
            height: 35px;
            background-color: rgb(246, 246, 241);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .search-btn img {
            width: 100%;
            height: 80%;
        }

        .card {
            height: 180px;
            margin: 20px 5px 20px 5px;
        }

        .card img {
            width: 100%;
            height: 90%;
        }

        .card p {
            font-size: 13px;
            color: #9b9b9b;
        }

        .col-4 img {
            margin: 10px 5px 20px 5px;

            width: 85%;
        }

        hr {
            width: 90%;
            color: #eee;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<%
    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
%>
<%--  顶部导航各个页面共享--%>
<div id="top">
    <jsp:include page="top.jsp"/>
</div>

<%--  搜素区--%>
<div id="search">
    <h2>读书时刻</h2>
    <input type="text" placeholder="书名、作者、ISBN" class="search-input">
    <div class="search-btn">
        <img src="img/search.png" alt="">
    </div>
</div>

<%--  主体内容区--%>
<div class="container">
    <div class="row">
        <div class="col-8">
            <h3>热门图书</h3>
            <hr>
            <div class="row">
                <%-- 遍历图书集合--%>
                <%
                    for (Book book : bookList) {
                        pageContext.setAttribute("book", book);
                %>
                <div class="col-2 card">
                    <%-- 点击图书封面进入图书详情--%>
                    <a href="${pageContext.request.contextPath}/detail/${book.id}">
                        <img src="img/${book.cover}" alt="">
                    </a>
                    <p style="color: rgb(51, 119, 178)">${book.name}</p>
                    <p>${book.author}</p>
                </div>
                <%
                    }
                %>
            </div>
        </div>
        <div class="col-4">
            <h3>排行榜</h3>
            <hr>
            <img src="img/right.jpg" alt="">
        </div>

    </div>

    <footer>
        <ur>
            <li>@2015-2019</li>
            <li>niit.edu.cn, all rights reserved</li>
<%--            <li>南工院计软院</li>--%>
        </ur>
        <ul>
            <li>联系我们</li>
            <li>帮助中心</li>
            <li>法律声明</li>
            <li>移动合作</li>
        </ul>
    </footer>
</div>
</body>
</html>
