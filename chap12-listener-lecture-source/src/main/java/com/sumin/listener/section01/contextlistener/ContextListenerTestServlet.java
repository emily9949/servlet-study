package com.sumin.listener.section01.contextlistener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/context")
public class ContextListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("contextListener 확인용 서블릿 동작");

        ServletContext context = getServletContext(); // 프로그램이 켜져있는동안 사용하는 공간

        context.setAttribute("test1", "value1"); // added
        context.setAttribute("test2", "value2"); // added 
        context.setAttribute("test2", "value3"); // 키 값이 같으면 replace가 동작함
        context.setAttribute("test3", "value3");

        context.removeAttribute("test2"); // remove
    }
}
