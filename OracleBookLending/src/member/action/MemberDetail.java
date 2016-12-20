package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.db.Member;
import member.db.MemberDAO;

public class MemberDetail implements MemberAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberDetail---");
		System.out.println();
		System.out.println("MemberDetail mID :"+request.getParameter("mID"));
		request.setCharacterEncoding("euc-kr");
		String mID = (String)request.getParameter("mID");
		Member m = new Member();
		MemberDAO dao = new MemberDAO();
		ActionForward forward = new ActionForward();
		m = dao.mDetail(mID);
		request.setAttribute("m", m);
		
		forward.setRedirect(false);
		forward.setPath("/mList/m_detail.jsp");
		
		return forward;
	}

}
