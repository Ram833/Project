

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccLoginVerify
 */
public class AccLoginVerify extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		String accusn = request.getParameter("aun");
		String accpwd = request.getParameter("apwd");
		
		AdminModel m = new AdminModel();
		m.setUsername(accusn);
		m.setPassword(accpwd);
		boolean l = m.aCCount();
		try {
		if(l==true)
		{
			response.sendRedirect("/Assignment/accountSucStudent.jsp");
		}
		else
		{
			response.sendRedirect("/Assignment/accountFailStudent.jsp");
		}
	  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
