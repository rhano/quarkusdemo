package com.redhat.servlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
             doPost(req,res);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");//setting the content type
        PrintWriter pw = res.getWriter();//get the stream to write the data

//writing html in the stream
        pw.print("<html><head><link rel=\"stylesheet\" href=\"css/style.css\"></head>");
        String name = req.getParameter("name");
        System.out.println(name);
        pw.println("<div class=\"container\"><center><img src=\"images/quarkus.png\" class=\"rotate\" width=\"200\" height=\"200\" /></center><br/><br/><span><font size='20' color='white'>Welcome " + name + "!</font></span><div><br/><br/><center><img src=\"images/openshift.jpg\" class=\"rotate\" width=\"200\" height=\"200\" /></center></html>");
    }
}
