package ORG.SRI.SPRING;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/book")
public class Book extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		product pro = new product();
		pro.id=1;
		pro.brand="bakshi";
		pro.name="aec";
		pro.price=120.00;
		
		ServletContext con =getServletContext();
		String val1=con.getInitParameter("key1");
		String val2=	con.getInitParameter("key2");


		
		ServletOutputStream out=resp.getOutputStream();
		out.print("<head><body bgcolor='red'>"+
				"<h1>'"+ val1 +"'    '"+ val2 +"' </h1>"+
		"<h1>thanks for' '"+pro.name+" '  '</h1>"+
				"<a href='cont.html'>back</a>"+
		"</body><html>"
				);
	
	}

}
