import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.*;
import javax.servlet.http.*;  

 
public class FirstServlet extends HttpServlet {  

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("username");  
    String p=request.getParameter("userpass");  
   
     try{    
    
        SendMail sm = new SendMail();
	String code = sm.getRandom();
	User user = new User(n,p,code);
	boolean test = sm.sendMail(user);
	if(test){
		HttpSession session = request.getSession();
		session.setAttribute("authcode",user);
		response.sendRedirect("verify.html");
	}  
    }catch(Exception e){
	out.print("Failed to send Mail");
    }
     
          
    out.close();  
    }  
}  