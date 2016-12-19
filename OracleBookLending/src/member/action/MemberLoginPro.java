package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.db.Member;
import member.db.MemberDAO;

public class MemberLoginPro implements MemberAction{
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("\n---MemberLoginPro---");
		HttpSession session = request.getSession();
		    String userId = request.getParameter("id");
		    String userPw = request.getParameter("pw");
		    
		    MemberDAO dao = new MemberDAO();
		    Member m = new Member();
		    m = dao.loginSession(userId, userPw);
		    
		    System.out.println("MemberLoginPro.java m.getMember_id "+m.getMember_id());
		    System.out.println("MemberLoginPro.java m.getMember_name "+m.getMember_name());
		    System.out.println("MemberLoginPro.java m.getMember_pw "+m.getMember_pw());
		    System.out.println("MemberLoginPro.java m.getMember_level "+m.getMember_level());
		    
		    session.setAttribute("userId", m.getMember_id());
		    session.setAttribute("userName", m.getMember_name());
	        session.setAttribute("userPw", m.getMember_pw());
		    session.setAttribute("userImg", m.getMember_img());
		    session.setAttribute("userLevel", m.getMember_level());
		   
		    ActionForward forward = new ActionForward();
			forward.setRedirect(true);
			forward.setPath(request.getContextPath()+"/KsmartLibrary.me");
			System.out.println("---MemberLoginPro End---\n");	
		return forward;
	}


}
