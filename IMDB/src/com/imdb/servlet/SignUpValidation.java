package com.imdb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imdb.dao.LoginDao;
import com.imdb.dao.SignUpDAO;

/**
 * Servlet implementation class SignUpValidation
 */
@WebServlet("/SignUpValidation")
public class SignUpValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		 PrintWriter out = response.getWriter();
		    String firstname = request.getParameter("firstname");
		    String middlename = request.getParameter("middlename");
		    String lastname = request.getParameter("lastname");
		    String emailid = request.getParameter("emailid");
		    String createpassword = request.getParameter("createpassword");
		    String confirmpassword = request.getParameter("confirmpassword");
		    String mobilenumber = request.getParameter("mobilenumber");
		    String address = request.getParameter("address");
		    String pincode = request.getParameter("pincode");
		    System.out.println(firstname+" "+middlename+" "+lastname);
		    boolean status=false;
		    SignUpDAO sign = new SignUpDAO();
		   
		    out.println("welcome "+firstname);
		    try {
				
				status= sign.signup(firstname, middlename, lastname,emailid, createpassword, confirmpassword, mobilenumber, address,pincode );
				System.out.println(status);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 if(status==true)
			 {
				 response.sendRedirect("Main.html");
			 }
		}
//		    if(firstname.isEmpty()||middlename.isEmpty()||lastname.isEmpty()||emailid.isEmpty()||createpassword.isEmpty()||confirmpassword.isEmpty()||mobilenumber.isEmpty()||address.isEmpty()||pincode.isEmpty())
//			{
//				RequestDispatcher rd = request.getRequestDispatcher("SignUp.html");
//				out.println("<font color=red>Please fill all the fields</font>");
//				rd.include(request, response);
//			}
//			else
//			{
//				RequestDispatcher rd = request.getRequestDispatcher("Main.html");
//				rd.forward(request, response);
//			}
		
		    
		    //	response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
