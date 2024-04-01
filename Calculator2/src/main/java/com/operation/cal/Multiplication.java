package com.operation.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/multipy")
public class Multiplication extends HttpServlet {
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		try {
			String num1=req.getParameter("a1");
			String num2=req.getParameter("a2");
			double a1=Double.parseDouble(num1);
			double a2=Double.parseDouble(num2);
			
			double result=a1*a2;
			out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
