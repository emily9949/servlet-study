package com.sumin.redirect.section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/* 설명. Redirect 는 상태가 공유되지 않기 때문에 attribute의 값이 공유되어 보이지 않는다 */
@WebServlet("/redirect")
public class Redirectservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("리다이렉트 이후 Request의 attribute 확인: " + req.getAttribute("test"));
        System.out.println("리다이렉트 이후 Request의 parameter 확인: " + req.getAttribute("test"));
    }
}
