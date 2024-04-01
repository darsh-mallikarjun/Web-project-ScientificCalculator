package com.operation.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sub")
public class Subtraction extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		try {
			String num1=req.getParameter("t3");
			String num2=req.getParameter("t4");
			double t3=Double.parseDouble(num1);
			double t4=Double.parseDouble(num2);
			
			double result=t3-t4;
			out.println(result);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}

