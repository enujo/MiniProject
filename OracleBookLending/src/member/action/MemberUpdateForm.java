package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.db.Member;
import member.db.MemberDAO;

public class MemberUpdateForm implements MemberAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberUpdatePro---");
		System.out.println();
		System.out.println("MemberUpdatePro mID :"+request.getParameter("mID"));
		request.setCharacterEncoding("euc-kr");
		String mID = (String)request.getParameter("mID");
		Member m = new Member();
		MemberDAO dao = new MemberDAO();
		ActionForward forward = new ActionForward();
		m = dao.mUpdate(mID);
		request.setAttribute("m", m);
		
		forward.setRedirect(false);
		forward.setPath("/mUpdate/m_update_form.jsp");
		
		return forward;
	}
}
