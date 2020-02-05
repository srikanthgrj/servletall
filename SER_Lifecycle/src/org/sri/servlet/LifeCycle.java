package org.sri.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/LifeCycler",loadOnStartup = 12,initParams = {
		@WebInitParam(name = "abc", value = "mmm")
})
public class LifeCycle extends GenericServlet{
	public LifeCycle() {
		System.out.println("created const");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initalizing");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig con = getServletConfig();
		String val=con.getInitParameter("abc");
		//String val1 =con.getInitParameter("abc");
		
		String appName= req.getParameter("name");
		String appVer =req.getParameter("ver");
		String appSize=req.getParameter("size");
		ServletOutputStream sout = resp.getOutputStream();
		sout.print("this app is  " +appName+ "   "+val +"   ");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("closing costly resources");
	}
	
	
	
}
