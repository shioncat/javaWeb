package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;


@WebServlet("/addMemberController")
public class addMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*1.����-->username
		 *2.�P�_�b���O�_����-->query(�b��)
		 *3.true-->����--->addMemberError.jsp
		 *4.false->�L���b��-->�����Ҧ����-->new member-->add(m);-->addMemberSuccess.jsp 
		 */
		request.setCharacterEncoding("big5");
		String Username=request.getParameter("username");
		
		if(new memberDao().query(Username))
		{
			response.sendRedirect("addMemberError.jsp");
		}
		else
		{
			String Name=request.getParameter("name");
			String Password=request.getParameter("password");
			String Address=request.getParameter("address");
			String Phone=request.getParameter("phone");
			String Mobile=request.getParameter("mobile");
			
			member m=new member(Name,Username,Password,Address,Phone,Mobile);
			
			new memberDao().add(m);
			
			response.sendRedirect("addMemberSuccess.jsp");
			
			
			
		}
	}

}