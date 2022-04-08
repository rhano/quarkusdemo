package com.redhat.servlet;
import javax.servlet.*;
import java.io.*;

public class TestFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        String myParam = request.getParameter("name");

        if(!"Dr. Evil".equalsIgnoreCase(myParam)){
            filterChain.doFilter(request, response);
            return;
        }
        PrintWriter pw = response.getWriter();
        pw.print("<html><head><link rel=\"stylesheet\" href=\"css/style.css\"></head>");
        response.getWriter().write("<div class=\"container\"><span><font size='20' color='white'>You have been blocked " +myParam + "! </font></span><div></html>");
    }

    public void destroy() {
    }
}
