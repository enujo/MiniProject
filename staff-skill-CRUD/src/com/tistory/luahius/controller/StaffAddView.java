package com.tistory.luahius.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tistory.luahius.dao.StaffSkillReligionDao;

@WebServlet("/StaffAddView")
public class StaffAddView extends HttpServlet implements Action {
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	System.out.println(">>> StaffAdd.java execute <<<");
    	ActionForward forward = new ActionForward();
    	System.out.println(">>> StaffAdd.java execute <<< forward : "+forward);
    	
    	StaffSkillReligionDao skillDao = new StaffSkillReligionDao();
    	System.out.println(">>> StaffAdd.java execute <<< skillDao : "+skillDao);
    	List skillist = new ArrayList();
    	System.out.println(">>> StaffAdd.java execute <<< skillist 1 : "+skillist);
    	skillist = skillDao.getSkill();
    	System.out.println(">>> StaffAdd.java execute <<< skillist 2 : "+skillist);
    	
    	StaffSkillReligionDao religionDao = new StaffSkillReligionDao();
    	List relilist = new ArrayList();
    	relilist = religionDao.getReligion();
    	
    	StaffSkillReligionDao schoolDao = new StaffSkillReligionDao();
    	List schoollist = new ArrayList();
    	schoollist = schoolDao.getSchool();
    	
    	
    	request.setAttribute("skillist",skillist);
    	request.setAttribute("relilist",relilist);
    	request.setAttribute("schoollist",schoollist);
    	
    	forward.setRedirect(false);
    	forward.setPath("/WEB-INF/jsp/add/StaffAdd.jsp");   	
    	
		return forward;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> StaffAdd.java doGet <<<");
			try {
				execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> StaffAdd.java doPost <<<");
		try {
			execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
