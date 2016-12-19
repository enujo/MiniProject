package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.db.Member;
import member.db.MemberDAO;

public class MemberLoginPro implements MemberAction{
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberLoginPro---");
		HttpSession session = request.getSession();
		    String userId = request.getParameter("id");
		    String userPw = request.getParameter("pw");
		    
		    MemberDAO dao = new MemberDAO();
		    Member m = new Member();
		    m = dao.loginSession(userId, userPw);
		    session.setAttribute("userId", m.getMember_id());
	        session.setAttribute("userPw", m.getMember_pw());
		    session.setAttribute("userImg", m.getMember_img());
		   
		    ActionForward forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/MemberList.me");
		return forward;
	}


}
