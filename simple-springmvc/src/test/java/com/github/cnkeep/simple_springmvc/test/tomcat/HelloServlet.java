package com.github.cnkeep.simple_springmvc.test.tomcat;

import sun.reflect.Reflection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述~
 *
 * @author <a href="zhangleili924@gmail.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/22
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        writer.println("<html><title>Welcome Tomcat</title><body>");
        writer.println("<h1>Hello World!</h1>");
        writer.println("</body></html>");
        getRequestPath(req);
    }

    private String getRequestPath(HttpServletRequest req) {
        String path = "/";
        String contextPath = req.getContextPath();
        System.out.println("contextPath: " + contextPath);

        String pathInfo = req.getPathInfo();
        System.out.println("pathInfo: " + pathInfo);

        String requestURI = req.getRequestURI();
        System.out.println("requestURI: " + requestURI);

        String servletPath = req.getServletPath();
        System.out.println("servletPath: " + servletPath);

        System.out.println(Reflection.getCallerClass());
        return path;
    }
}
