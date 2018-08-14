

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminVerification
 */
public class AdminVerification extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("/Assignment/allowAdmin.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
