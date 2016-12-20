package book.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.db.Books;
import book.db.BooksDAO;

public class BooksListPro implements BooksAction{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		System.out.println("---BooksListPro---");
		System.out.println();
		String select = request.getParameter("select");
		String value = request.getParameter("value");
		
		BooksDAO bdao = new BooksDAO();
		ArrayList<Books> alb = bdao.bList(select, value);
		request.setAttribute("alb", alb);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/bList/b_list.jsp");
		
		return forward;
	}

}
