package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zeng
 * @ClassName ContextLoaderListener
 * @Description 上下文加载监听， 在服务启动时即刻生效，用来生成用户数据和图书数据
 * @Date 2019/10/2
 * @Version 1.0
 **/
@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /**
     * @param sce
     * @Description 容器初始化方法
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
        List<User> userList = new ArrayList<>(3);
        User[] users = {
                new User(1, "aaa@qq.com", "698d51a19d8a121ce581499d7b701668", "ToBe", "user1.jpeg", "江苏南京", LocalDate.of(2018, 6, 11)),
                new User(2, "bbb@qq.com", "698d51a19d8a121ce581499d7b701668", "NotToBe", "user2.jpeg", "上海", LocalDate.of(2010, 6, 11)),
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "忍", "user3.jpg", "江西南昌", LocalDate.of(2018, 6, 11))
        };
        userList = Arrays.asList(users);

//        图书列表
        List<Book> bookList = new ArrayList<>(15);
        Book[] books = {
                new Book(1, "人类简史", "book1.jpg", "【以色列】尤瓦尔·赫拉利"),
                new Book(2, "影响力", "book2.jpg", "【美】罗伯特·西奥迪尼"),
                new Book(3, "你只是看起来很努力", "book3.jpg", "李尚龙"),
                new Book(4, "万历十五年", "book4.jpg", "黄仁宇"),
                new Book(5, "山海经", "book5.jpg", "（西汉）刘向"),
                new Book(6, "盗墓笔记", "book6.jpg", "南派三叔"),
                new Book(7, "诛仙", "book7.jpg", "萧鼎"),
                new Book(8, "如何阅读一本书", "book8.jpg", "【美】莫提默·J."),
                new Book(9, "王阳明全集", "book9.jpg", "（明）王守仁"),
                new Book(10, "余生，请多指教", "book10.jpg", "柏林石匠"),
                new Book(11, "人性的弱点", "book11.jpg", "【美】卡耐基"),
                new Book(12, "狼道", "book12.jpg", "【美】特曼·托尔瑞"),
                new Book(13, "明朝那些事儿", "book13.jpeg", "当年明月"),
                new Book(14, "曾国藩家书", "book14.jpeg", "（清）曾国藩"),
                new Book(15, "雪中悍刀行", "book15.jpeg", "烽火戏诸侯")



        };
        bookList = Arrays.asList(books);

        ServletContext servletContext = sce.getServletContext();

        servletContext.setAttribute("userList", userList);
        servletContext.setAttribute("bookList", bookList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
    }
}
