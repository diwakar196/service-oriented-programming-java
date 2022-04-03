import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ServSession extends HttpServlet {

 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException
 {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 HttpSession session=request.getSession();
 String Heading;
 try
 {
 Integer cnt=(Integer)session.getAttribute("cnt");
 out.println("<html>");
 out.println("<head>");
 out.println("<title>Servlet ServSession</title>");
 out.println("</head>");
 out.println("<body><br/>");
 if(cnt==null)
 {
 cnt=new Integer(1);
 Heading="Welcome you for the first time";
 }
 else
 {
 Heading="Welcome Once again";
 cnt=new Integer(cnt.intValue()+1);
 }
 session.setAttribute("cnt", cnt);
out.println("<h1>Welcome to session Program: You are Visiting this site as :"+cnt +
" Visitor </h1>");
out.println("<h1>You are Working Servlet Program at " + request.getContextPath () +" <br/><br/>"+Heading);
out.println("</h1> <h2>Your Hidden Session ID is:"+session.getId()+" :ID</h2>");
 out.println("</body>");
 out.println("</html>");

 } finally
 {
 out.close();
 }
 }
}