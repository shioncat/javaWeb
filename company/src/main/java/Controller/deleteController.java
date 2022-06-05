package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;

@WebServlet("/deleteController")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*1.接收
		 *2.轉型 
		 *3.刪除
		 *4.返回delete.jsp 
		 */
		
		String Id=request.getParameter("id");
		int ID=Integer.parseInt(Id);
		
		new memberDao().delete(ID);
		
		response.sendRedirect("delete.jsp");
	}

}