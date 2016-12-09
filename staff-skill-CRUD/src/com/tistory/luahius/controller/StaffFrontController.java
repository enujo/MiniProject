package com.tistory.luahius.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaffFrontController extends HttpServlet implements Servlet {
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		final String RequestURI = request.getRequestURI();
		final String contextPath = request.getContextPath();
		final String command = RequestURI.substring(contextPath.length());
		System.out.println("frontController RequestURI : "+RequestURI);
		System.out.println("frontController contextPath : "+contextPath);
		System.out.println("frontController contextPath.length() : "+contextPath.length());
		System.out.println("frontController command : "+command);
		
		System.out.println("StaffFrontController.java doProcess");
		
		ActionForward forward = null;
		Action action = null;
		
		if(command.equals("/staff/AddView.jh")){
			action= new StaffAddView();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/staff/Add.jh")){
			action = new StaffAdd();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		if(forward != null){
			if(forward.getRedirect()){
				System.out.println("StaffFrontController.java response.sendRedirect");
				System.out.println("controller forward.getPaht() : "+forward.getPath());
				response.sendRedirect(forward.getPath());
			}else{
				System.out.println("StaffFrontController.java dispatcher");
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("StaffFrontController.java doGet");
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("StaffFrontController.java doPost");
		doProcess(request, response);
	}

}
