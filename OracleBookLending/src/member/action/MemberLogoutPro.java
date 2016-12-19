package member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogoutPro implements MemberAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
        session.invalidate();

        ActionForward forward = new ActionForward();
        forward.setRedirect(true);
		forward.setPath(request.getContextPath()+"/KsmartLibrary.me");
		
		return forward;
	}

}
