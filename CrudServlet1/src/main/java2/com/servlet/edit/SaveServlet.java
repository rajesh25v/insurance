package com.servlet.edit;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.tpoint.Emp;
import com.createiq.tpoint.EmpDao;

/**
 * Servlet implementation class SaveServlet
 */
//@WebServlet("SaveServlet") 
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String  name=request.getParameter("name");
		String mail=request.getParameter("email");
		String pwd=request.getParameter("password");
		String country=request.getParameter("country");
		
		Emp e=new Emp();
		e.setName(name);
		e.setEmail(mail);
		e.setPassword(pwd);
		e.setCountry(country);
		
		int status=EmpDao.save(e);
		if(status>=0) {
			out.println("<p>record inserted successfully</p>");
			
			request.getRequestDispatcher("index.html").include(request, response);
			
		}else {
			out.println("Sorry! unable to to save record");
		}
		out.close();
	}

}
