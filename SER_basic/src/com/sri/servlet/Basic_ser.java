package com.sri.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Basicmovie")
public class Basic_ser extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("nm");
		String date =req.getParameter("date");
		String duration=req.getParameter("dur");
		ServletOutputStream sout = resp.getOutputStream();
		sout.print("movie is " +name);


	}

	

}
