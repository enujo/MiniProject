package book.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.db.Books;
import book.db.BooksDAO;

public class BooksViewPro implements BooksAction{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---BooksListPro---");
		System.out.println();
		String bookNo = request.getParameter("bookNo");
		BooksDAO bdao = new BooksDAO();
		Books b = bdao.bView(bookNo);
		request.setAttribute("b", b);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/bView/b_view.jsp");
		
		return forward;
	}

}
