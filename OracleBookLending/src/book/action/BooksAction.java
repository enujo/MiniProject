package book.action;

import javax.servlet.http.*;

public interface BooksAction {
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
