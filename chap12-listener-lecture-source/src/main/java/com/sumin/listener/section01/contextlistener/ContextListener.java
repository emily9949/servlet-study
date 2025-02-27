package com.sumin.listener.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {

    public ContextListener() {
        System.out.println("ContextListener 인스턴스 생성 !");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context init!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context destroy!!");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("attribute added!!");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("attribute removed!!");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("attribute replaced!!");
    }
}
