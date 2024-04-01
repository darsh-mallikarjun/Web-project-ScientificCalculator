package com.operation.cal;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/expont")
public class Exponentiation extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		try {
			String str1=req.getParameter("b1");
			String str2=req.getParameter("b2");
			Double b1 =Double.parseDouble(str1);
			Double b2 =Double.parseDouble(str2);
			
			double result=Math.pow(b1,b2);
			out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
