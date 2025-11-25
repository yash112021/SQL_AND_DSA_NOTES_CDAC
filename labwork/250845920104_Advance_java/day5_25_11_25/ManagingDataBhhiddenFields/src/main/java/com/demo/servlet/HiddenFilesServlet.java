package com.demo.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/serv1", "/serv*" })
public class HiddenFilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("nm");
		out.println("<form action='serv2' method='get'>");
		out.println("location : <input type='text' id='loc' name='loc'>" );
		out.println("<input type='hidden' id='hdloc' name='hdloc' value="+name+">");
		out.println("<button name='btn' id='btn'>submit</button>");
		out.println("</form");
		
	}

}
