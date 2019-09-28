package com.login.controller;

import com.login.entity.User;
import com.login.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Zeng
 * @ClassName UserController
 * @Description 拦截/login请求，处理用户登录功能
 * @Date
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/login")
public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //取出请求参数
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        //创建UserService对象
        UserService us = new UserService();
        //初始化数据
        us.init();
        //调出登录功能
        User user = us.userLogin(account, password);
        if (user != null) {
            resp.getWriter().print("success");

        }else{
            resp.getWriter().print("error");
        }

    }
}
