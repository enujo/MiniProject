package book.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.action.ActionForward;
import book.action.BooksAction;
import book.action.BooksAddPro;
import book.action.BooksListPro;
import book.action.BooksUpdateForm;
import book.action.BooksViewPro;

@WebServlet("/BooksController")
public class BooksController extends HttpServlet {

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---BooksController - doProcess---");
    	request.setCharacterEncoding("euc-kr");
		String RequestURI=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=RequestURI.substring(contextPath.length());
		System.out.println(command + "<-- command BController.java");
		System.out.println("----------BController.java----------------");
		System.out.println();
    	ActionForward forward = null;
    	BooksAction action = null;
    	
    	if(command.equals("/BooksAddForm.bo")){
			System.out.println("IF - BooksAddForm.bo");
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/bAdd/b_add_form.jsp");
    	}else if(command.equals("/BooksAddPro.bo")){
			System.out.println("IF - BooksAddPro.bo");
			action = new BooksAddPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/BooksListPro.bo")){
			System.out.println("IF - BooksListPro.bo");
			action = new BooksListPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/BooksViewPro.bo")){
			System.out.println("IF - BooksViewPro.bo");
			action = new BooksViewPro();
			try{
				forward=action.execute(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(command.equals("/BooksUpdateForm.bo")){
			System.out.println("IF - BooksUpdateForm.bo");
			action = new BooksUpdateForm();
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
		System.out.println("---BooksController -  doGet---");
		this.doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("---BooksController -  doPost---");
		this.doProcess(request, response);
	}

}
