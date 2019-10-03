package com.bo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Zeng
 * @ClassName ContextLoaderListener
 * @Description 上下文加载监听， 在服务启动时即刻生效，用来生成用户数据和图书数据
 * @Date 2019/10/2
 * @Version 1.0
 **/
public class ContextLoaderListener implements ServletContextListener {
    /**
     * @Description 容器初始化方法
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }
}
