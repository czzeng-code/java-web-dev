package com.bo.listener;

import com.bo.entity.Book;
import com.bo.entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
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
                new User(3, "ccc@qq.com", "698d51a19d8a121ce581499d7b701668", "忍", "user1.jpg", "江西南昌", LocalDate.of(2018, 6, 11))
        };
        userList = Arrays.asList(users);

//        图书列表
        List<Book> bookList = new ArrayList<>(10);
        Book[] books = {
                new Book(1, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                new Book(2, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维"),
                new Book(3, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨"),
                new Book(4, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                new Book(5, "哀伤纪", "book5.jpg", "钟晓阳"),
                new Book(6, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                new Book(7, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维"),
                new Book(8, "绿山墙的安妮", "book3.jpg", "[美]理查德·耶茨"),
                new Book(9, "敌人与邻居", "book4.jpg", "[英]伊恩·布莱克"),
                new Book(10, "哀伤纪", "book5.jpg", "钟晓阳"),
                new Book(11, "漫长的婚约", "book1.jpg", "[法] 塞巴斯蒂安"),
                new Book(12, "庸人自扰", "book2.jpg", "[英]戴伦•麦加维")
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
