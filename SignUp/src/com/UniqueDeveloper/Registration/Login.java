package com.UniqueDeveloper.Registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class Login
 */
//@WebServlet("Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String uemail=request.getParameter("username");
	String upasward=request.getParameter("password");
	HttpSession session=request.getSession();
	RequestDispatcher dispatcher=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/family?useSSL=false","root","9963");
		PreparedStatement pt=con.prepareStatement("SELECT*FROM RELATIVE where uemail=? and upasward=?");
		pt.setString(1,uemail);
		pt.setString(2,upasward);
		
		 ResultSet rt=pt.executeQuery();
		 if(rt.next()) {
			session.setAttribute("name",rt.getString("uname"));
			dispatcher=request.getRequestDispatcher("index.jsp");
		 
		 }else {
			 request.setAttribute("status","failed");
		 dispatcher=request.getRequestDispatcher("login.jsp");
	}
	dispatcher.forward(request, response);
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}

}
