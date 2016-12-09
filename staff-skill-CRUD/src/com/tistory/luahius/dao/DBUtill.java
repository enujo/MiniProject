package com.tistory.luahius.dao;

import java.sql.*;

public class DBUtill {
	private static final String driver;
	private static final String url;
	private static final String user;
	private static final String password;
	
	static{
		driver = "oracle.jdbc.driver.OracleDriver";
		url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		user = "enujo";
		password = "java0000";
	}
	
	public static Connection getConncetion(){
		Connection connection = null;
		
		try{
			
			Class.forName(driver);
			System.out.println("DBUtill.java 드라이버 로딩 : "+Class.forName(driver));
			connection = DriverManager.getConnection(url, user, password);			
		}catch(Exception e){
			System.out.println("DBUtill.java 드라이버 연결 실패");
			e.printStackTrace();
		}
		System.out.println("DBUtill.java 드라이버 연결 완료 connection : "+connection);
		return connection;
	}
	
	public static void Close(Connection connection, Statement statement, ResultSet resultset){
		if(resultset !=null){
			try {
				resultset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(statement !=null){
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection !=null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}



