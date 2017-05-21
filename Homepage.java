package org.project.shoppers;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Homepage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("uname");
		String password = req.getParameter("pword");
		req.setAttribute("username1", userName);
		req.setAttribute("password1", password);
		RequestDispatcher rd = req.getRequestDispatcher("/electronics_page");
		rd.forward(req, resp);
	}
}
