package jp.co.aforce.servlet;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.dao.UsersDAO;

/**
 * Servlet implementation class Login_In
 */
@WebServlet(urlPatterns= {"/views/login-in"})
public class Login_In extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_In() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		
		UsersDAO u_dao = new UsersDAO(); 
		String fullName = u_dao.getNames(id, pass); 
		
		if(fullName == null) {
			request.getRequestDispatcher("login-error.jsp").forward(request, response);
		}

		
		HttpSession session = request.getSession();
		session.setAttribute("userName", fullName);
		
		response.sendRedirect("user-menu.jsp");
		
		
	}

}
