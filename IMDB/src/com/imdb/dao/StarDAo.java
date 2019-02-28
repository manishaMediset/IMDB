package com.imdb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.imdb.database.SignUpConnectionFactory;

public class StarDAo {
	
		static Connection conn = SignUpConnectionFactory.getConnection();
		public static boolean validate(String username,String password){  
			boolean status=false;  
		try{
			
			PreparedStatement write=conn.prepareStatement(  
				"select * from signup where emailid=? and confirmpassword=?");  
				write.setString(1,username);  
				write.setString(2,password);  
				      
				ResultSet rs=write.executeQuery();  
				status=rs.next();
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return status;
	}
	}
