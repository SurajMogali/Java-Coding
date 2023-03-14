package com.demo.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception,ClassNotFoundException {

		String url = "jdbc:mariadb://localhost:3306/aliens";
		String uname = "root";
		String pw = "root";
		String query = "select * from student where userId=1";

		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uname, pw);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("userName");
		System.out.println(name);

		st.close();
		conn.close();

	}

}
