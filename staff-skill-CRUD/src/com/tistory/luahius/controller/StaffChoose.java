package com.tistory.luahius.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaffChoose implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(" >>> StaffChoose.java <<< start.. ");
		ActionForward forward = new ActionForward();
		
		
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/jsp/list/StaffChoose.jsp");
		
		return forward;
	}

}
