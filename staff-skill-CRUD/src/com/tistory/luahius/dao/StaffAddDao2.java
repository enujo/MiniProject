package com.tistory.luahius.dao;

import java.sql.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import com.tistory.luahius.dto.Staff;

public class StaffAddDao2 {
	
	public int stafAdd(Staff staff){
		int re = 0;
		String sql = "INSERT INTO STAFF VALUES(staff_seq.nextval,?,?, TO_DATE(?, 'YYYY-MM-DD'),?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		PreparedStatement stmt = null;
		ResultSet resultset = null;
		
		System.out.println(staff.getName());
		System.out.println(staff.getSn());
		System.out.println(staff.getGraduateday());
		System.out.println(staff.getSchool().getNo());
		System.out.println(staff.getReligion().getNo());
		connection = DBUtill.getConncetion();
		
		
		
		
		try {
			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, staff.getName());
			statement.setString(2, staff.getSn());
			statement.setString(3, staff.getGraduateday());
			statement.setInt(4, staff.getSchool().getNo());
			statement.setInt(5, staff.getReligion().getNo());
			statement.executeUpdate();
			resultset = statement.getGeneratedKeys();
			String autoinsertedKey = (resultset.next())?resultset.getString(1) : null;
			
			/*for(int i =0; i<list.)*/
			stmt = connection.prepareStatement("INSERT INTO staffskill values(staffskill_seq.nextval,?,?)");
			stmt.setString(1, autoinsertedKey);
			stmt.setInt(2, 3);
			stmt.executeUpdate();

			System.out.println(autoinsertedKey+" ·ê·ç¶ö¶ó rs ¹ÝÈ¯µÇ´Â °ª");
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtill.Close(connection, statement, resultset);
		}
		
		return re;
		
	}
}
