package com.full.registration;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegistrationFormServlet extends HttpServlet {
	
	String fname;
	String lname;
	
	int  age;
	String mail;
	String phnno;
	String address;
	  RequestDispatcher rd;
	  long	 phnNo;
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		
		
		PrintWriter out=resp.getWriter();
		
		
		resp.setContentType("text/html");
		
		 fname=req.getParameter("fname");
		lname=req.getParameter("lname");
		
		 try{
		  age= Integer.parseInt(req.getParameter("age"));
		  
		 }
		 
		 catch(NumberFormatException ne)
		 {
		out.println("enter  correct age");
		 /* out.println(
					"<html>"+"\n"+"<body>"+"\n"+"<a href='index.html'> click this link to register</a>"+"\n"+
					"<body>"+"\n"+"<html>");*/
		rd=req.getRequestDispatcher("Register.html");
		rd.include(req, resp);
			
		 }
		mail=req.getParameter("mail");
		 phnno=req.getParameter("phnno");
		address=req.getParameter("addr");
		
		
	
		
		    
		
				if((fname!=" ")&&((phnno.length())==10) && age>0)
				{
					try{
			phnNo=Long.parseLong(phnno);
			out.println("Registered sucessfully"+"<br>");
			
			out.println("firstname="+fname+"<br>");
			out.println("lastName="+lname+"<br>");
			out.println("age="+age+"<br>");
			out.println("mail="+mail+"<br>");
			out.println("address="+"<br>");
			out.println("phoneNo="+phnno+"<br>");
				}
			catch(Exception e)
					{
			out.println("enter correct phoneno"+"<br>");
		/*	out.println(
					"<html>"+"\n"+"<body>"+"\n"+"<a href='index.html'> click this link</a>"+"\n"+
								"<body>"+"\n"+"<html>");*/
			rd=req.getRequestDispatcher("Register.html");
			rd.include(req, resp);
					}
				}
				else if(phnno.length()!=10)
				{
					out.println("enter correct phoneno" +"<br>");
					/*out.println(
							"<html>"+"\n"+"<body>"+"\n"+"<a href='index.html'> click this link to register</a>"+"\n"+
										"<body>"+"\n"+"<html>");*/
					rd=req.getRequestDispatcher("Register.html");
					rd.include(req, resp);
				}
				else if(age<0)
				{
					out.println("enter age in positive values" +"<br>");
				/*	out.println(
							"<html>"+"\n"+"<body>"+"\n"+"<a href='index.html'> click this link to register</a>"+"\n"+
										"<body>"+"\n"+"<html>");
					
					*/
					rd=req.getRequestDispatcher("Register.html");
					rd.include(req, resp);
				}
				else if(fname.trim().equals(null))
				{
					out.println("first name should not be empty"+"<br>");
					out.println(
							"<html>"+"\n"+"<body>"+"\n"+"<a href='index.html'> click this link to register</a>"+"\n"+
										"<body>"+"\n"+"<html>");
					
					
					
				}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		resp.sendRedirect("Register.html");

	}
}
