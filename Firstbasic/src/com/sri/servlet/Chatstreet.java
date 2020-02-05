package com.sri.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/basic")
public class Chatstreet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String shopname = req.getParameter("sn");
		String noofitem = req.getParameter("noitem");
		
		ServletOutputStream ops = resp.getOutputStream();
		ops.print(name);
		
	}

}
