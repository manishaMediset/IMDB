package com.imdb.dao;
import com.imdb.pojo.SignUpPojo;
import com.imdb.database.SignUpConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.imdb.database.SignUpConnectionFactory;;

public class SignUpDAO {
	public boolean signup(String firstname,String middlename,String  lastname,String emailid,String createpassword,String confirmpassword,String mobilenumber,String address,String pincode)throws SQLException{
		Connection conn = SignUpConnectionFactory.getConnection();	
		String query = "insert into signup values(?,?,?,?,?,?,?,?,?)";
        	
        	PreparedStatement write = conn.prepareStatement(query);
        	write.setString(1, firstname);
        	write.setString(2, middlename);
        	write.setString(3,lastname);
        	write.setString(4,emailid);
        	write.setString(5, createpassword);
        	write.setString(6, confirmpassword);
        	write.setString(7,mobilenumber);
        	write.setString(8, address);
        	write.setString(9, pincode);
             write.executeUpdate();
        	return true;     	
        }
}
