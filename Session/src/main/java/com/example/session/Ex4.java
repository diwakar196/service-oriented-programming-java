package com.example.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Ex4")
public class Ex4 extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("userName");
            out.print("Welcome "+n);
            out.print("<a href='Ex41?uname=" + n + "'>&nbsp;&nbsp;visit&nbsp;</a>");
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
