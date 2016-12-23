package book.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.db.Books;
import book.db.BooksDAO;
import book.db.Category;

public class BooksUpdateForm implements BooksAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		System.out.println("---BooksListPro---");
		System.out.println();
		String bookNo = request.getParameter("bookNo");
		BooksDAO bdao = new BooksDAO();
		Books book = bdao.bView(bookNo);
		ArrayList<Category> category = bdao.bCategory();
		request.setAttribute("category", category);
		request.setAttribute("book", book);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/bUpdate/b_update.jsp");
		
		return forward;
	}

}
