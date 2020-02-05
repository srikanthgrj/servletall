package com.xworkz.mine;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class Canr1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//req.setAttribute("prodname",productname );
		//req.setAttribute("prodque", productquality);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("ss");
		dispatcher.forward(req, resp);
		
	}
	

}
