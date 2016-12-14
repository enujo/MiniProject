package com.tistory.luahius.dao;

import java.sql.*;
import java.util.*;

import com.tistory.luahius.dto.Staff;

public class StaffAddDao3 {
	
	public int stafAdd(Staff staff, List list){
		int re = 0;
		String sql = "INSERT INTO STAFF VALUES(staff_seq.nextval,?,?, TO_DATE(?, 'YYYY-MM-DD'),?,?)";
		Connection connection = null;
		PreparedStatement statement = null;
		PreparedStatement skillstatement = null;
		ResultSet resultset = null;
		String[] keyCol = {"no"};
		System.out.println("StafAddDao.java list : "+list);
		System.out.println(staff.getName());
		System.out.println(staff.getSn());
		System.out.println(staff.getGraduateday());
		System.out.println(staff.getSchool().getNo());
		System.out.println(staff.getReligion().getNo());
		connection = DBUtill.getConncetion();
		
		try {
			statement = connection.prepareStatement(sql, keyCol);
			statement.setString(1, staff.getName());
			statement.setString(2, staff.getSn());
			statement.setString(3, staff.getGraduateday());
			statement.setInt(4, staff.getSchool().getNo());
			statement.setInt(5, staff.getReligion().getNo());
			statement.executeUpdate();
			resultset = statement.getGeneratedKeys();
			
			if(resultset.next()){
				System.out.println("StaffAddDao.java Key : "+resultset.getInt(1));
			}
			
			
		for(int i=0; i<list.size(); i++){	
			skillstatement = connection.prepareStatement("INSERT INTO staffskill"
					+ "VALUES(staffskill_seq.nextval,?,?)");
			skillstatement.setInt(1, resultset.getInt(1));
			skillstatement.setInt(2, (int) list.get(i));
			skillstatement.executeUpdate();	
		}

								
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtill.Close(connection, statement, resultset);
		}
		
		return re;
		
	}
}
