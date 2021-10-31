package org.komissarov.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "MyServlet", urlPatterns = "/hello")
public class MyServlet extends HttpServlet {

    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public String getServletInfo() {
        return "MyServlet";
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.getWriter().print("<html><body><h1>Hello</h1>");
        res.getWriter().print("</body></html>");
    }

    @Override
    public void destroy(){
    }
}
