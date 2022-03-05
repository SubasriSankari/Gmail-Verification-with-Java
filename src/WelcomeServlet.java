import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.*;
import javax.servlet.http.*; 
  
public class WelcomeServlet extends HttpServlet {  

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    HttpSession session=request.getSession(false);  
    if(session!=null){
    	String n=(String)session.getAttribute("uname");   
        out.print("You are Logged In !!!...\nWelcome "+n); 
    } 
    else{
        response.sendRedirect("Login.html");
    }
    out.print("<a href='index.html'> Index</a>");      
   
    }  
  
}