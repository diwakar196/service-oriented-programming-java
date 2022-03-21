package com.example.login;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ex2")
public class Ex2 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        String user, pwd;
        try{
            response.setContentType("text/html");
            user = request.getParameter("username");
            pwd = request.getParameter("pass");
            System.out.println("<html><body><h1>");
            System.out.println("Welcome to Servlet Program <br>");
            System.out.println("Username is:"+user);
            System.out.println("<br>Password is: "+pwd);
            System.out.println("</h1></body></html>");
            System.out.println("......Successful Execution......");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
