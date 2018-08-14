

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminAccount
 */
public class AdminAccount extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		String accnam = request.getParameter("an");
		String accusn = request.getParameter("aun");
		String accpass = request.getParameter("apw");
		try {
		AdminModel m = new AdminModel();
		m.setName(accnam);
		m.setUsername(accusn);
		m.setPassword(accpass);
		
		boolean r = m.account();
		if(r==true)
		{
			response.sendRedirect("/Assignment/accountSucceful.jsp");
		}
		else
		{
			response.sendRedirect("/Assignment/accountFailed.jsp");
		}
	  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
