package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOperations extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//server sending response in text and html
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String btn = req.getParameter("btn");
		
		//now reading the input
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		
		
		
		//using the switch case
		switch(btn) {
		
			case "add" -> {
				int ans = n1+n2;
				out.println("<h1>Addition : "+ans+ "</h1>");
			}
			
			case "sub" -> {
				int ans = n1 - n2;
				out.println("<h1>Subtraction: "+ans +"</h1>");
			}
			
			case "mul" -> {
				int ans = n1 * n2;
				out.println("<h1>Multiplication: "+ans +"</h1>");
			}
			case "div" -> {
				int ans = n1 / n2;
				out.println("<h1>Division :"+ans +"</h1>");
			}
			case "rem" -> {
				int ans = n1 - n2;
				out.println("<h1>remainder after divide :"+ans +"</h1>");
			}
			case "fact" -> {
				int ans = fact(n1) ;
				out.println("<h1>factorial of number "+n1+" is -> "+ans +"</h1>");
			}
		}
	}
	
	//factorial function
			public int fact(int a) {
				int fact =1;
				int i=a;
				while(a!=1) {
					fact *= i;
					i--;
				}
				return fact;
			}
}
