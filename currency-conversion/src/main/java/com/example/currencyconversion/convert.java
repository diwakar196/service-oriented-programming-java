package com.example.currencyconversion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/S1")
public class convert extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String amount;
        String s;
        String d = "dollar",r="rial",y="yen";
        try{
            response.setContentType("text/html");
            amount = request.getParameter("amount");
            s = request.getParameter("se1");
            out.println("<html><body><h3>");
            out.println(amount+" in "+s);
            out.println("<br/>");
            if(s.compareTo(d)==0){
                double a = Double.parseDouble(amount);
                a = a *0.013;
                out.println("In Dollar: "+ a);
            }
            else if(s.compareTo(r)==0){
                double a = Double.parseDouble(amount);
                a = a *0.0051;
                out.println("In Rial: "+ a);
            }
            else{
                double a = Double.parseDouble(amount);
                a = a*1.57;
                out.println("In Yen: "+ a);
            }
            out.println("</h3></body></html>");
        }
        catch(Exception e){
            out.println("Error: "+e.getMessage());
        }
    }
}