package com.operation.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareRoot extends HttpServlet {
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		try {
			String num1=req.getParameter("t5");
		    double t5=Double.parseDouble(num1);
			
			
			double result=t5*t5;
			out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

