package com.tistory.luahius.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaffList implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(" >>> StaffList.java <<< start.. ");
		
		ActionForward forward = new ActionForward();
		
		
		
		forward.setRedirect(true);
		forward.setPath(request.getContextPath()+"/WEB-INF/staff/StaffList.jsp");
		return forward;
	}

}
