package book.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import book.db.Books;
import book.db.BooksDAO;
import book.db.Category;

public class BooksAddPro implements BooksAction{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Books b = new Books();
		BooksDAO bdao = new BooksDAO();
		ActionForward forward = new ActionForward();
		
		// image 용
		String realPath = "";
		String savePath = "uploadbooks";
		int maxSize = 5 * 1024 * 1024;
		// realPath = request.getRealPath(savePath);
		realPath = request.getServletContext().getRealPath(savePath);
		// 서버 상의 물리적인 업로드 경로를 얻어 옴
		List savefiles = new ArrayList();
		try {
			MultipartRequest multi = null;
			multi = new MultipartRequest(request, realPath, maxSize, "euc-kr", new DefaultFileRenamePolicy());
			//
			Enumeration files = multi.getFileNames();
			while (files.hasMoreElements()) {
				String name = (String) files.nextElement();
				// file input box 의 이름들을 하나씩 가져옴
				if (files.hasMoreElements()) {
					// 지금 가져온 이름 다음 이름이 더 있으면
					// 즉, 지금 enumeration에서 가져온 이름이 마지막 요소가 아니면
					savefiles.add(multi.getFilesystemName(name) + ",");
				} else {
					savefiles.add(multi.getFilesystemName(name));
				}
				// 마지막 파일이 아니면 파일명 뒤에 , 를 붙여서 추가하고
				// 마지막 파일이면 , 를 붙이지 않고 추가
			}
			StringBuffer fl = new StringBuffer();
			for (int i = 0; i < savefiles.size(); i++) {
				fl.append(savefiles.get(i));
			}
			b.setBooks_no(
							multi.getParameter("books_cate")
							+"."
							+multi.getParameter("books_name").substring(0, 1)
							+multi.getParameter("books_writer").substring(0, 1)
							+multi.getParameter("books_publi").substring(0, 1)
						);
			b.setBooks_name(multi.getParameter("books_name"));
			b.setBooks_writer(multi.getParameter("books_writer"));
			Category category = new Category();
			category.setCategory_no(Integer.parseInt(multi.getParameter("books_cate")));
			b.setCategory(category);
			b.setBooks_publi(multi.getParameter("books_publi"));
			b.setBooks_img(fl.toString());

			int result = bdao.bInsert(b);
			if (result <= 0) {
				response.setContentType("text/html;charset=euc-kr");
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert('등록실패')");
				out.println("history.back()");
				out.println("</script>");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		forward.setRedirect(true);
		forward.setPath(request.getContextPath() + "/BooksListPro.bo");
			return forward;
}

}
