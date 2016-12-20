package pay.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class PayDAO {

	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<Pay> alb;
	Pay p;
	
	public PayDAO(){
		System.out.println("---PayDAO - 생성자메소드---");
		try{
			Context initCtx = new InitialContext();
			Context envCtx=(Context)initCtx.lookup("java:comp/env");
		  	   ds = (DataSource) envCtx.lookup("jdbc/OracleDB");
		}catch(Exception ex){
			System.out.println("DB 연결 실패 : " + ex);
			return;
		}
	}
	private void close(Connection conn, Statement pstmt, ResultSet rs){
		if(rs != null){
			try{
				rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
	         try {
	        	 pstmt.close();
	         } catch (SQLException e) {
	             e.printStackTrace();
	         }
	    }
	    if(conn != null) {
	         try {
	        	 conn.close();
	         } catch (SQLException e) {
	              e.printStackTrace();
	         }
	    }
	}
}