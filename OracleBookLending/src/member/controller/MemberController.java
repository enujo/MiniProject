package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.action.ActionForward;
import member.action.MemberAction;
import member.action.MemberJoinPro;
import member.action.MemberListPro;
import member.action.MemberLoginPro;
import member.action.MemberLogoutPro;
import member.action.MemberUpdateForm;
import member.action.MemberUpdatePro;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("---MemberController - doProcess---");
    	request.setCharacterEncoding("euc-kr");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(RequestURI + "<-- RequestURI MController.java");
		System.out.println(contextPath + "<-- contextPath MController.java");
		System.out.println(contextPath.length() + "<-- contextPath.length() MController.java");
		System.out.println(command + "<-- command MController.java");
		System.out.println("----------MController.java----------------");
		System.out.println();
    	System.out.println("MemberController -  doProcess");
    	ActionForward forward = null;
		MemberAction action = null;
		
		if(command.equals("/MemberJoinForm.me")){
			System.out.println("IF - MemberJoinForm.me");
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/mJoin/m_join_form.jsp");
		}else if(command.equals("/MemberJoinPro.me")){
			System.out.println("IF - MemberJoinPro.me");
			action = new MemberJoinPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/MemberList.me")){
			System.out.println("IF - MemberList.me");
			action = new MemberListPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/MemberUpdate.me")){
			System.out.println("IF - MemberUpdate.me");
			action = new MemberUpdateForm();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/MemberUpdatePro.me")){
			System.out.println("IF - MemberUpdatePro.me");
			action = new MemberUpdatePro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/MemberLoginPro.me")){
			System.out.println("IF - MemberLoginPro.me");
			action = new MemberLoginPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/MemberLogoutPro.me")){
			System.out.println("IF - MemberLogoutPro.me");
			action = new MemberLogoutPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
    	
		
		
		if(forward != null){
			if(forward.isRedirect()){
				response.sendRedirect(forward.getPath());
			}else{
				RequestDispatcher dispatcher=
					request.getRequestDispatcher(forward.getPath());
				System.out.println(forward.getPath() + "<--- forward.getPath()");
				System.out.println();
				dispatcher.forward(request, response);
			}
		}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---MemberController -  doGet---");
		this.doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---MemberController - doPost---");
		this.doProcess(request, response);
	}

}
