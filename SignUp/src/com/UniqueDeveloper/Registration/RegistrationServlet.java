package com.UniqueDeveloper.Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.println("working");
		
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String upasward=request.getParameter("pass");
		String umobileNo=request.getParameter("contact");
		
		PrintWriter p=response.getWriter();
		
		p.println(uname);
		p.println(upasward);
		p.println(uemail);
		p.println(umobileNo);
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/family?useSSL=false","root","9963");
			PreparedStatement pst=con.prepareStatement("INSERT INTO relative(uname,uemail,upasward,umobile) values(?,?,?,?)");
			pst.setString(1,uname);
			pst.setString(2,uemail);
			pst.setString(3,upasward);
			pst.setString(4,umobileNo);
			RequestDispatcher dispacher=null;
			int recount=pst.executeUpdate();
			dispacher=request.getRequestDispatcher("registration.jsp");
			
			if(recount>0) {
				request.setAttribute("status","success");
			}else {
				request.setAttribute("status","fail");
				dispacher.forward(request, response);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
	
				e.printStackTrace();
			}
		}
		
	}

}
