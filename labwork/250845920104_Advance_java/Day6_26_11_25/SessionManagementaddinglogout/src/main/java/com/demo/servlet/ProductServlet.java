package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.beans.User;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet({ "/ProductServlet", "/prodserv*" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		User usr = (User) sess.getAttribute("nm");
		if(usr!=null) {
			String btn = request.getParameter("btn");
			switch(btn) {
			case "show" ->{
				int cid = Integer.parseInt(request.getParameter("cartegory"));
			    ProductService pserv = new ProductServiceImpl();
			    List<Product> plist = pserv.getByCid(cid);
			    out.println("Now you are in The Product Servlet");
			    out.println("<form action='addcart*' method='get'> ");
			    
			 // traverse the product by using the loop
			    for(Product p:plist) {
			    	out.println("<input type='checkbox' name='productname' id='"+p.getPrdId()+"' value='"+p.getDesc()+"'>"
			    			+ "<label for='"+p.getPrdId()+"'>"+p.getDesc()+"</label>");
			    }
			    out.println("<button id='btn' value='btn' >Add to Cart</button>");
			    out.println("</form>");
			    out.println("<a href='logout'>LogOut</a>");
			}
			case "order" ->{
				RequestDispatcher rd = request.getRequestDispatcher("Placeorder");
				rd.forward(request, response);
			}
			}
		}else {
			out.println("unauthorized user");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	    
	    
	    
	   
	    
	}


}
