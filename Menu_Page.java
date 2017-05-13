package org.project.shoppers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Menu_Page extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("image/jpg");
		resp.setContentType("text/html");

		String userName = (String) req.getAttribute("uname");
		String password = (String) req.getAttribute("pword");
		req.setAttribute("uname", "userName");
		req.setAttribute("pword", "password");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<style>");
		out.println(
				"p {font-family: 'Times New Roman';font-size: 300%;color: darkblue;position: relative;left: 150px;}");
		out.println("a {text-decoration: none;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body bgcolor='#deb887'>");
		out.println("	<form action='menu' method='post'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td><img src='images/menu/home-appliances-slide3.jpg'></td>");
		out.println(
				"<td><div name='electronics'><a href='electronics.html'><p name='electronics'>Electronics</p></a></div></td>");
		out.println("</tr>");
		out.println(
				"<tr><td><div name='clothing' >	<a href='cloth.html'><p name='clothing'>Clothing</p></a></div></td><td><img src='images/menu/white-shirts-men-the-perfect-white-shirt.jpg'width='521'></td></tr>");
		out.println(
				"<tr><td><img src='images/menu/food-myths-busted.jpg' width='521'></td><td><div name='food'><a href='food.html'><p name='food'>Food</p></a>	</div></td>	</tr>");
		out.println("</table></form></body></html>");
		out.flush();
		out.close();
		RequestDispatcher rd = req.getRequestDispatcher("/electronics_page");
		rd.forward(req, resp);
		return;
	}
}
