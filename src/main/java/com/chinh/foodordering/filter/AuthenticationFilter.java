/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package com.chinh.foodordering.filter;

import com.chinh.foodordering.constant.SessionConstant;
import com.chinh.foodordering.model.User;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String uri = req.getRequestURI();

        if (uri.endsWith("/login")
        || uri.endsWith("/logout")
        || uri.endsWith("/403.jsp")
        || uri.contains("/css/")
        || uri.contains("/js/")
        || uri.contains("/images/")
        || uri.contains("/assets/")
        || uri.endsWith(".css")
        || uri.endsWith(".js")
        || uri.endsWith(".png")
        || uri.endsWith(".jpg")
        || uri.endsWith(".ico")) {

    chain.doFilter(request, response);
    return;
}

        HttpSession session = req.getSession(false);

        User user = null;

        if (session != null) {
            user = (User) session.getAttribute(SessionConstant.LOGIN_USER);
        }

        String contextPath = req.getContextPath();

// Chưa đăng nhập
if (user == null) {
    resp.sendRedirect(contextPath + "/login");
    return;
}

// Chỉ Admin được truy cập Restaurant
if (uri.startsWith(contextPath + "/restaurants")
        && user.getRoleId() != 1) {

    request.setAttribute("ERROR",
            "You don't have permission to access this page.");

    req.getRequestDispatcher("/views/403.jsp")
            .forward(request, response);

    return;
}

chain.doFilter(request, response);
    }
}
