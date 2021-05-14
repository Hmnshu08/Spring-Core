package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	private LoginService service =new LoginService();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		request.setAttribute("email", request.getParameter("email"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Yahoo!!!!!!!!</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("My First Servlet");
//		out.println("</body>");
//		out.println("</html>");

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		boolean isValidUser = service.validateUser(name, password, email);

		if (isValidUser) {
			request.setAttribute("name", name);
			request.setAttribute("email", email);
//			request.setAttribute("todos", todoService.retrieveTodos());
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Invalid Credentials!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
	

}