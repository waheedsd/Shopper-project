package org.project.shoppers;

import java.io.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Electronics extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("image/jpg");
		resp.setContentType("jpg/png");
		resp.setContentType("text/html");
		String userName = (String) req.getAttribute("uname");
		String pageElect = (String) req.getAttribute("electronics");
		PrintWriter out=resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Electronics</title>");
		out.println("<style>");
		out.println("  img{height: 250px;width: 328px;}");
		out.println(" .electronics{ font-size: 30px;left:12px;top12px;font-family:Helvetica;text-align: center;font-weight: 500;}");
		out.println(" .electronics:hover{ background-color: black;color: white;border: 2px solid;border-radius: 12px;}");
		out.println(".back{text-align: right; font-size: 40px;right:12px;font-family:Helvetica;font-weight: 500;background-color: black;color: white;border: 2px solid;border-radius: 12px;}");
		out.println(" </style></head><body>");
		out.println("<form action='Electronic' method='post'>");
		out.println("<table border='0px'>");
		out.println("<tr>");
		out.println("<td colspan='4'><div class='back' name='back_page_menu'><a href='userid.html'>Back</a></div></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><img src='images/electronics/lg.jpg'><div><a href='order.html'><span class='electronics' name='refrigerator'>Refrigerator</span></div><div name='price'>10000.00</div></td>");
		out.println("<td><img src='images/electronics/apple-laptop.jpg'><div class='electronics' name='Laptop'><a href='order.html>Laptop</a></div> </td>");
		out.println(" <td><img src='images/electronics/incandescent-bulb1.png'><div class='electronics' name='Bulb'>Bulb</div></td>");
		out.println("<td><img src='images/electronics/iphone7-gallery6-2016.jpg'><div class='electronics' name='Iphone'>Iphone</div></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><img src='images/electronics/LG Inverter V Split Type Air Conditioner.jpg'><div class='electronics' name='AirConditioner'>Air Conditioner</div></td>");
		out.println("<td><img src='images/electronics/Maharaja-Whiteline-Juicer-Mixer-Grinder-SDL844856781-1-a1ed9.jpg'> <div class='electronics' name='Mixer'>Mixer</div></td>");
		out.println("<td><img src='images/electronics/microwave-oven.jpg'><div class='electronics' name='MicroOven'>Micro Oven</div></td>");
		out.println("<td><img src='images/electronics/p029802.jpg'><div class='electronics' name='vacuum cleaner'>vacuum cleaner</div></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><img src='images/electronics/philips-qt4005-15-original-imadgszx24npp7tg.jpg'><div class='electronics' name='Trimmer'>Trimmer</div></td>");
		out.println("<td><img src='images/electronics/Samsung-WF56H9110AG.jpg'><div class='electronics' name='Washing Machine'>Washing Machine</div> </td>");
		out.println("<td><img src='images/electronics/sony-bravia-kdl-50w829a-1.jpg'><div class='electronics' name='Sony'>Sony</div></td>");
		out.println("<td><img src='images/electronics/bose speaker.jpg'><div class='electronics' name='Bose Speaker'>Bose Speaker</div></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		RequestDispatcher rd = req.getRequestDispatcher("/order_page");
		rd.forward(req, resp);
		return;
	}
}
