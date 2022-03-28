package com.example.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
@WebServlet("/Ex41")
public class Ex41 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try{
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("uname");
            out.print("Good.... This is"+n+"University");
            out.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
