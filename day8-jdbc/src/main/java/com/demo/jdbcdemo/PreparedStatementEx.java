package com.demo.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mariadb://localhost:3306/aliens";
		String uname = "root";
		String pw = "root";
		String query = "insert into student values(?,?)";
		String userName="Praj";
		int userId=4;

		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uname, pw);
		PreparedStatement st =  conn.prepareStatement(query);
		
		
		st.setInt(1,userId);
		
		st.setString(2,userName);
		int count= st.executeUpdate();
		
		System.out.println(count+"rows affected");
		

		st.close();
		conn.close();

	}

}
