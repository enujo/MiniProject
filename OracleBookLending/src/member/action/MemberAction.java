package member.action;

import javax.servlet.http.*;

public interface MemberAction {
	public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
