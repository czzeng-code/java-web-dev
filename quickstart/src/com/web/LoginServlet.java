package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter( "password");
        //将用户名存入
        req.setAttribute("username", username);
        //服务器端跳转，URL地址不变
        req.getRequestDispatcher("index.jsp").forward(req, resp);

        //获取session对象
//        HttpSession session = req.getSession();
//
//        session.setAttribute("username", username);
//
//        resp.sendRedirect("/index.jsp");
    }
}
