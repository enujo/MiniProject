package com.tistory.luahius.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tistory.luahius.controller.Action;
import com.tistory.luahius.controller.ActionForward;
import com.tistory.luahius.dao.StaffAddDao;
import com.tistory.luahius.dto.Religion;
import com.tistory.luahius.dto.School;
import com.tistory.luahius.dto.Staff;

public class StaffAdd implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		StaffAddDao dao = new StaffAddDao();
		Staff staff = new Staff();
		Religion religion = new Religion();
		School school = new School();
		
		String NAME = request.getParameter("name");
		String SN = (request.getParameter("frontNumber"))+"-"+(request.getParameter("backNumber"));
		String GRADUATEDAY = request.getParameter("Gday");
		
		int SCHOOLNO = Integer.parseInt(request.getParameter("schoolNo"));
		int RELIGIONNO = Integer.parseInt(request.getParameter("religion"));
		
		String[] SKILLNO = request.getParameterValues("chB");
		
		System.out.println("name"+NAME);
		System.out.println("religion"+RELIGIONNO);		
		System.out.println("SN"+SN);
		System.out.println("GRADUATEDAY"+GRADUATEDAY);
		
		for(int i =0; i<SKILLNO.length; i++){
			
			System.out.println("SKILLNO"+SKILLNO[i]);
		}
		staff.setName(NAME);
		staff.setSn(SN);
		staff.setGraduateday(GRADUATEDAY);
		religion.setNo(RELIGIONNO);
		staff.setReligion(religion);	
		school.setNo(SCHOOLNO);
		staff.setSchool(school);
		
		dao.stafAdd(staff);
		
		forward.setRedirect(false);
    	forward.setPath("/WEB-INF/jsp/add/StaffAdd.jsp");   	
		
		return forward;
	}

}
