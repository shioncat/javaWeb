package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String passWord=request.getParameter("password");
		HttpSession session=request.getSession();
		if(userName.equals("abc") && passWord.equals("1234"))
		{
			session.setAttribute("UserName", userName);
			response.sendRedirect("member/success.html");
		}
		else
		{
			response.sendRedirect("error.html");
		}
		
		
		
	}

}