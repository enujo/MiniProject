package com.tistory.luahius.dao;
import java.sql.*;
import java.util.*;

import com.tistory.luahius.dto.Religion;
import com.tistory.luahius.dto.School;
import com.tistory.luahius.dto.Skill;
public class StaffSkillReligionDao {
	
	public List getSchool(){
		String sql= "SELECT * FROM school";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		List schoollist = new ArrayList();
		
		try {
			connection = DBUtill.getConncetion();
			System.out.println("StaffSkillReligionDao.java connenction : "+DBUtill.getConncetion());
			statement = connection.prepareStatement(sql);
			System.out.println("StaffSkillReligionDao.java statement : "+statement);
			resultset = statement.executeQuery();
			System.out.println("StaffSkillReligionDao.java resultset : "+resultset);
			while(resultset.next()){
				School school = new School();
				school.setNo(resultset.getInt("no"));
				school.setGraduate(resultset.getString("graduate"));
				schoollist.add(school);
			}
			return schoollist;
		} catch (SQLException e) {
			System.out.println("StaffSkillReligionDao.java getSchool 오류");
			e.printStackTrace();
		}finally{
			DBUtill.Close(connection, statement, resultset);
		}
		return null;		
	}
	public List getSkill(){
		String sql= "SELECT * FROM skill";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		List list = new ArrayList();
		
		try {
			connection = DBUtill.getConncetion();
			System.out.println("StaffSkillReligionDao.java connenction : "+DBUtill.getConncetion());
			statement = connection.prepareStatement(sql);
			System.out.println("StaffSkillReligionDao.java statement : "+statement);
			resultset = statement.executeQuery();
			System.out.println("StaffSkillReligionDao.java resultset : "+resultset);
			while(resultset.next()){
				Skill skill = new Skill();
				skill.setNo(resultset.getInt("no"));
				skill.setName(resultset.getString("name"));
				list.add(skill);
			}
			return list;
		} catch (SQLException e) {
			System.out.println("StaffSkillReligionDao.java getSkill 오류");
			e.printStackTrace();
		}finally{
			DBUtill.Close(connection, statement, resultset);
		}
		return null;		
	}
	public List getReligion(){
		String sql = "SELECT * FROM religion";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		List relilist = new ArrayList();
		
		connection = DBUtill.getConncetion();
		
		try {
			statement = connection.prepareStatement(sql);
			resultset = statement.executeQuery();
			while(resultset.next()){
				Religion religion = new Religion();
				religion.setNo(resultset.getInt("no"));
				religion.setName(resultset.getString("name"));
				relilist.add(religion);
			}
			return relilist;
		} catch (SQLException e) {
			System.out.println("StaffSkillReligion.java getReligion 오류");
			e.printStackTrace();
		}finally{
			DBUtill.Close(connection, statement, resultset);
		}
		return null;
		
	}
}
