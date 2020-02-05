package com.xworkz.mine;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ss")
public class Canr2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productname =req.getParameter("pn");
		String productquality = req.getParameter("pq");
		int pq=Integer.parseInt(productquality);
		double price=10000.00;
		double total = pq* price;
		ServletOutputStream outputStream =resp.getOutputStream();
		outputStream.print("thank you for shopping total price of your order q"+total+"\tproduct are "+productname);
		
		
		
	}

}
