package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*1.����-->request
	 *2.System.out.println 
	 *3.�����e��-->ok.html 
	 * 
	 * 
	 */
		
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		System.out.println("name="+Name+"\t�K�X:"+Password);
		
		response.sendRedirect("ok.html");
		
	}

}