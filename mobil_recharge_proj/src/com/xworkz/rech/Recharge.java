package com.xworkz.rech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Recharge extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String number = req.getParameter("number");
		String serviceprovider = req.getParameter("serviceprovider");
		String plan = req.getParameter("plan");
		String type = req.getParameter("type");
		
		PrintWriter printWriter = resp.getWriter();
		if(!number.isEmpty()) {
			printWriter.print("recharge success "+ number);
		}
		else {
			printWriter.print("insert valid number");
		}
			
	}

}
