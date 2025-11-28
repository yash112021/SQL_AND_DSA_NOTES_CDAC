package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.User;

@WebServlet("/Placeorder")
public class PlaceorderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		User usr = (User) sess.getAttribute("nm");
		PrintWriter out = response.getWriter();
		if(usr!=null) {
			//retrieving the cart from session
			List<String> list = (List<String>) sess.getAttribute("list");
			list.stream().forEach(s->out.println(s));
			out.println("Order placed successfully");
			out.println("<a href='logout'>Logout</a>");
		}
		
	}

}
