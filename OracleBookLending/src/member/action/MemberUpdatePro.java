package member.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import member.db.Member;
import member.db.MemberDAO;

public class MemberUpdatePro implements MemberAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberUpdatePro---");
		System.out.println();
				
		Member m = new Member();
		MemberDAO dao = new MemberDAO();
		ActionForward forward = new ActionForward();
		
		// image 용
		String realPath = "";
		String savePath = "upload";
		int maxSize = 5 * 1024 * 1024;
		// realPath = request.getRealPath(savePath);
		realPath = request.getServletContext().getRealPath(savePath);
		// 서버 상의 물리적인 업로드 경로를 얻어 옴
		List savefiles = new ArrayList();
		
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
		int result = 0;
		if(multi.getParameter("member_pw").equals(multi.getParameter("member_pwcheck"))){

		m.setMember_id(multi.getParameter("member_id"));
		m.setMember_pw(multi.getParameter("member_pw"));
		m.setMember_level(multi.getParameter("member_level"));
		m.setMember_phone(multi.getParameter("member_phone"));
		m.setMember_addr(multi.getParameter("member_addr"));
		m.setMember_img(fl.toString());
		
		result = dao.mUpdatePro(m);
		
		}else{
			System.out.println("비번 다름");
			response.setContentType("text/html;charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('비밀번호 확인')");
			out.println("history.back()");
			out.println("</script>");
			return null;
		}
		if (result <= 0) {
			response.setContentType("text/html;charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('등록실패')");
			out.println("history.back()");
			out.println("</script>");
			return null;
		}		
		
		forward.setRedirect(true);
		forward.setPath(request.getContextPath()+"/MemberList.me");
		
		return forward;
	}
}
