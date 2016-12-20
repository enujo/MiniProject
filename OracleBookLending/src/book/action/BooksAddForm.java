package book.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import book.db.BooksDAO;
import book.db.Category;

public class BooksAddForm implements BooksAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---BookAddForm---");
		System.out.println();
		BooksDAO bdao = new BooksDAO();
		ArrayList<Category> category = bdao.bCategory();
		request.setAttribute("category", category);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/bAdd/b_add_form.jsp");
		
		return forward;
	}

}
