

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteAccount
 */
public class DeleteAccount extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		String accnum = request.getParameter("accn");
		AdminModel m = new AdminModel();
		m.setName(accnum);
		boolean k=m.delete();
		try {
		if(k==true)
		{
			response.sendRedirect("/Assignment/deleteSuccess.jsp");
		}
		else
		{
			response.sendRedirect("/Assignment/deleteFailed.jsp");
		}
	   }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
