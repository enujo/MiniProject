package book.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BooksDAO {

	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<Books> alb;
	Books b;
	
	public BooksDAO(){
		System.out.println("---BooksDAO - �����ڸ޼ҵ�---");
		try{
			Context initCtx = new InitialContext();
			Context envCtx=(Context)initCtx.lookup("java:comp/env");
		  	   ds = (DataSource) envCtx.lookup("jdbc/OracleDB");
		}catch(Exception ex){
			System.out.println("DB ���� ���� : " + ex);
			return;
		}
	}
	
	//å���
		public int bInsert(Books b) throws SQLException, ClassNotFoundException{
			System.out.println("--BooksDAO - bInsert");
			conn=ds.getConnection();
			pstmt = conn.prepareStatement(
					"insert into books values(?,?,?,sysdate,?,'0','0',?,?)");
			System.out.println(pstmt + "<-- pstmt 1");
			pstmt.setString(1, b.getBooks_no());
			pstmt.setString(2, b.getBooks_name());
			pstmt.setString(3, b.getBooks_writer());
			pstmt.setString(4, b.getBooks_cate());
			pstmt.setString(5, b.getBooks_publi());
			pstmt.setString(6, b.getBooks_img());
			System.out.println(pstmt + "<-- pstmt 2");
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "<-- result");
			
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			
			return result;
		}
		
		
		//����Ʈ
		public ArrayList<Books> bList(String select, String value) throws ClassNotFoundException, SQLException{
			System.out.println("--BooksDAO - bList");
			alb = new ArrayList<Books>();
			conn=ds.getConnection();
			String query = "select * from books";

		    
		    if (select==null & value==null){
		        pstmt = conn.prepareStatement(query);
		        rs = pstmt.executeQuery();
		        
		    }else if ( select!=null&value.equals("")){
		        pstmt = conn.prepareStatement(query);
		        rs = pstmt.executeQuery();
		        
		    }else if (select!=null&value!=null){
		        pstmt = conn.prepareStatement(query+" where "+select+"=?");
		        pstmt.setString(1, value);
		        rs = pstmt.executeQuery();
		    }

			while(rs.next()){
				b = new Books();
				b.setBooks_no(rs.getString("books_no"));
				b.setBooks_name(rs.getString("books_name"));
				b.setBooks_cate(rs.getString("books_cate"));
				b.setBooks_publi(rs.getString("books_publi"));
				b.setBooks_img(rs.getString("books_img"));
				
				if(rs.getInt("books_state")==0){
					b.setBooks_state("�뿩����");
				}else{
					b.setBooks_state("�Ұ���");

				}
				alb.add(b);	
				
							
			}
			
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
			
			return alb;
		}	
		
		public Books bView(String bookNo) throws SQLException{
			System.out.println("--BooksDAO - bView");
			b = new Books();
			conn=ds.getConnection();
			String query = "select * from books where books_no=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bookNo);
			rs = pstmt.executeQuery();
			if(rs.next()){
				b.setBooks_no(rs.getString("books_no"));
				b.setBooks_name(rs.getString("books_name"));
				b.setBooks_writer(rs.getString("books_writer"));
				b.setBooks_date(rs.getString("books_date"));
				b.setBooks_cate(rs.getString("books_cate"));
				b.setBooks_count(rs.getInt("books_count"));
				
				b.setBooks_publi(rs.getString("books_publi"));
				b.setBooks_img(rs.getString("books_img"));
				
				if(rs.getInt("books_state")==0){
					b.setBooks_state("�뿩����");
				}else{
					b.setBooks_state("�Ұ���");

				}
			}
			
			
			return b;
		}
}