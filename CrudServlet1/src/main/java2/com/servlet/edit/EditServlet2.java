package com.servlet.edit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.createiq.tpoint.Emp;
import com.createiq.tpoint.EmpDao;

/**
 * Servlet implementation class EditServlet2
 */
//@WebServlet("EditServlet2") 
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String sid=request.getParameter("id");
	
	int id=Integer.parseInt(sid);
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String country=request.getParameter("country");
	
	Emp e=new Emp();
	e.setId(id);
	e.setName(name);
	e.setEmail(email);
	e.setPassword(password);
	e.setCountry(country);
	
	int status=EmpDao.update(e);
	if(status>0) {
		response.sendRedirect("viewservlet");
	}else {
			out.println("!sorry unable to update record");
	}
	out.close();
	}

}
