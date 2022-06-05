package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex1")
public class ex1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ex1() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*<body> 
		 */
		response.setContentType("text/html; charset=BIG5");
		request.setCharacterEncoding("big5");
		PrintWriter out=response.getWriter();		
		out.println("<h1>hello servlet¥¨¦K¹q¸£</h1>");
		
		
		
		String Name=request.getParameter("name");		
		out.println("name="+Name+"<br>");
		
		
		String[] Interest=request.getParameterValues("interest");
		
		String show="";
		
		for(int i=0;i<Interest.length;i++)
		{
			show=show+Interest[i];
		}
		
		out.println("¿³½ì="+show);
		
		
		
	
	
	}

}