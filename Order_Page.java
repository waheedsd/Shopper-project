package org.project.shoppers;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Order_Page  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
{
	resp.setContentType("image/jpg");
	resp.setContentType("text/html");
	
	 String refrigerator2 = req.getParameter("refrigerator");
	 String pricenw=req.getParameter("price");
	 Double price2=Double.parseDouble(pricenw);
	 int qty=1;
	 PrintWriter out=resp.getWriter();
	 out.println("<!DOCTYPE html>");
		out.println("<html lang='en'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>order_page</title>");
		out.println("<style>");
		out.println("header {color: white;background-color: black;clear: left;text-align: center;margin-left: auto;margin-right: auto;position: absolute;top: 0;left: 0;width: 100%;}");
		out.println("footer {padding: 18px;color: white;background-color: black;clear: left;text-align: center;margin-left: auto;margin-right: auto;position: absolute;width: 100%;bottom: 0;left: 0;}");
		out.println(".checkout {text-align: center;}");
		out.println(".order {position: absolute;top: 15%;left: 42%;font-size: 40px;}");
		out.println(".details {position: absolute;left: 33%;top: 25%;font-size: 20px;}");
		out.println(".address {position: absolute;top: 45%;left: 33%;}");
		out.println("#address {font-size: 30px}");
		out.println("td {font-size: larger;}");
		out.println("</style></head><body><header>");
		out.println("<h1>SHOPPERS</h1></header>");
		out.println("<form action='product_details' method='post'>");
		out.println("<table border='0px' class='order'><tr><td id='heading'>MY ORDERS</td></tr><tr><td id='space'></td></tr></table>");
		out.println("<table border='0px' cellspacing='20px' cellpadding='20px'class='details'><tr><td>S.No</td><td>Product Name</td><td>Quantity</td><td>Price</td></tr></table>");
		out.println("<table class='address'>");
		out.println("<tr><td id='address'>ADDRESS:</td></tr>");
		out.println("<tr><td></td><td>Name:</td><td><input type='text'></td></tr>");
		out.println("<tr><td></td><td>Mobile no:</td><td><input type='text' maxlength='12'></td></tr>");
		out.println("<tr><td></td><td>e-mail:</td><td><input type='text'></td></tr>");
		out.println("<tr><td></td><td>City:</td><td><input type='text'></td></tr>");
		out.println("<tr><td></td><td>State:</td><td><input type='text'></td></tr>");
		out.println("<tr><td></td><td>Address:</td><td><textarea></textarea></td></tr>");
		out.println("<tr><td><input type='reset' name='reset'></td><td colspan='3' class='checkout'><input type='submit'value='CheckOut' name='checkout'></td></tr>");
		out.println("</table></form><footer> Copyright &copy; SHOPPERS.com </footer></body></html>");
		
		
	 Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into shoppers.shopper_details values(?,?,?)";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=dinga");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, refrigerator2);
			pstmt.setDouble(2, price2);
			pstmt.setInt(3, qty);
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(pstmt!=null)
			try
			{
				pstmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return;
}
}
