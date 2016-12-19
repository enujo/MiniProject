package member.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.db.Member;
import member.db.MemberDAO;

public class MemberListPro implements MemberAction{

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberListPro---");
		System.out.println();
		String select = request.getParameter("select");
		String value = request.getParameter("value");
		
		MemberDAO dao = new MemberDAO();
		ArrayList<Member> alm = dao.mList(select, value);
		request.setAttribute("alm", alm);
		
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/mList/m_list.jsp");
		
		return forward;
	}

}
