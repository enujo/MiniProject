package member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	DataSource ds;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<Member> alm;
	Member m;
	
	public MemberDAO(){
		System.out.println("---MemberDAO - 생성자메소드---");
		try{
			Context initCtx = new InitialContext();
			Context envCtx=(Context)initCtx.lookup("java:comp/env");
		  	   ds = (DataSource) envCtx.lookup("jdbc/OracleDB");
		}catch(Exception ex){
			System.out.println("DB 연결 실패 : " + ex);
			return;
		}
	}
	//회원 상세 정보
	public Member mDetail(String mID){
		System.out.println("--MemberDAO - mDetail");
		System.out.println("--MemberDAO - mDetail mID : " +mID);
		try {
			conn=ds.getConnection();
			pstmt = conn.prepareStatement(
					"SELECT * FROM member WHERE member_id=?");
			pstmt.setString(1, mID);
			rs=pstmt.executeQuery();
			if(rs.next()){
				m =new Member();
				m.setMember_id(rs.getString("member_id"));
				m.setMember_pw(rs.getString("member_pw"));
				m.setMember_name(rs.getString("member_name"));
				m.setMember_level(rs.getString("member_level"));
				m.setMember_phone(rs.getString("member_phone"));
				m.setMember_addr(rs.getString("member_addr"));
				m.setMember_date(rs.getString("member_date"));
				m.setMember_img(rs.getString("member_img"));
			}				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close(conn, pstmt, rs);
		}		
		System.out.println("DAO mUpdate m : "+m);
		return m;		
	}
	
	//회원 정보 수정
	public int mUpdatePro(Member m){
		System.out.println("--MemberDAO - mUpdatePro");
		System.out.println("--MemberDAO - mUpdatePro mID : " +m);
		int result = 0;
		try {
			conn=ds.getConnection();
			pstmt = conn.prepareStatement(
					"UPDATE member SET member_pw=?, member_phone=?, member_addr=?, MEMBER_IMG=? WHERE member_id=?");
			System.out.println(pstmt + "<-- pstmt 1");
			pstmt.setString(1, m.getMember_pw());
			pstmt.setString(2, m.getMember_phone());
			pstmt.setString(3, m.getMember_addr());
			pstmt.setString(4, m.getMember_img());
			pstmt.setString(5, m.getMember_id());
			System.out.println(pstmt + "<-- pstmt 2");
			result = pstmt.executeUpdate();
			System.out.println(result + "<-- result");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{	
		this.close(conn, pstmt, null);
		}
		return result;
		
	}
	//회원 정보 수정 창
	public Member mUpdate(String mID){
		System.out.println("--MemberDAO - mUpdate");
		System.out.println("--MemberDAO - mUpdate mID : " +mID);
		try {
			conn=ds.getConnection();
			pstmt = conn.prepareStatement(
					"SELECT * FROM member WHERE member_id=?");
			pstmt.setString(1, mID);
			rs=pstmt.executeQuery();
			if(rs.next()){
				m =new Member();
				m.setMember_id(rs.getString("member_id"));
				m.setMember_pw(rs.getString("member_pw"));
				m.setMember_name(rs.getString("member_name"));
				m.setMember_level(rs.getString("member_level"));
				m.setMember_phone(rs.getString("member_phone"));
				m.setMember_addr(rs.getString("member_addr"));
				m.setMember_date(rs.getString("member_date"));
				m.setMember_img(rs.getString("member_img"));
			}				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.close(conn, pstmt, rs);
		}		
		System.out.println("DAO mUpdate m : "+m);
		return m;		
	}
	//회원등록
	public int mInsert(Member m) throws SQLException, ClassNotFoundException{
		System.out.println("--MemberDAO - mInsert");
		conn=ds.getConnection();
		pstmt = conn.prepareStatement(
				"insert into member values(?,?,?,?,?,?,sysdate,?)");
		System.out.println(pstmt + "<-- pstmt 1");
		pstmt.setString(1, m.getMember_id());
		pstmt.setString(2, m.getMember_pw());
		pstmt.setString(3, m.getMember_name());
		pstmt.setString(4, m.getMember_level());
		pstmt.setString(5, m.getMember_phone());
		pstmt.setString(6, m.getMember_addr());
		pstmt.setString(7, m.getMember_img());
		System.out.println(pstmt + "<-- pstmt 2");
		int result = pstmt.executeUpdate();
		System.out.println(result + "<-- result");
		this.close(conn, pstmt, null);
		
		return result;
	}
	
	//리스트
	public ArrayList<Member> mList(String select, String value) throws ClassNotFoundException, SQLException{
		System.out.println("--MemberDAO - mList");
		alm = new ArrayList<Member>();
		conn=ds.getConnection();
		String query = "select * from member";

	    
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
			m = new Member();
			m.setMember_id(rs.getString("member_id"));
			m.setMember_name(rs.getString("member_name"));
			m.setMember_level(rs.getString("member_level"));
			m.setMember_phone(rs.getString("member_phone"));
			m.setMember_addr(rs.getString("member_addr"));
			m.setMember_date(rs.getString("member_date"));
			m.setMember_img(rs.getString("member_img"));

			alm.add(m);		
						
		}
		this.close(conn, pstmt, rs);
		return alm;
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
	public Member loginSession(String userId, String userPw) throws SQLException{
		System.out.println("--MemberDAO - loginSession");
		conn=ds.getConnection();
		m = new Member();
		String sql = "SELECT * FROM member WHERE member_id=? AND member_pw=?";
		
		pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,userId);
        pstmt.setString(2,userPw);
        rs = pstmt.executeQuery();
        if(rs.next()){        	
        	
        	m.setMember_id(rs.getString("member_id"));
        	m.setMember_name(rs.getString("member_name"));
        	m.setMember_level(rs.getString("member_level"));
        	m.setMember_pw(rs.getString("member_pw"));
        	m.setMember_img(rs.getString("member_img"));
        	
        	/*System.out.println("MemberDAO loginSession member_id "+rs.getString("member_id"));
        	System.out.println("MemberDAO loginSession member_name "+rs.getString("member_name"));
        	System.out.println("MemberDAO loginSession member_level "+rs.getString("member_level"));
        	System.out.println("MemberDAO loginSession member_pw "+rs.getString("member_pw"));
        	System.out.println("MemberDAO loginSession member_img "+rs.getString("member_img"));*/
        }
        
        System.out.println("--MemberDAO - loginSession end\br");

		return m;
	}
	
	
}
