package member.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import member.db.MemberDAO;
import member.db.Member;

public class MemberJoinPro implements MemberAction {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("---MemberJoinPro---");
		System.out.println();
		
		Member m = new Member();
		Member m2 = new Member();
		MemberDAO dao = new MemberDAO();
		ActionForward forward = new ActionForward();
	
			// image ��
			String realPath = "";
			String savePath = "upload";
			int maxSize = 5 * 1024 * 1024;
			// realPath = request.getRealPath(savePath);
			realPath = request.getServletContext().getRealPath(savePath);
			// ���� ���� �������� ���ε� ��θ� ��� ��
			List savefiles = new ArrayList();
			try {
				MultipartRequest multi = null;
				multi = new MultipartRequest(request, realPath, maxSize, "euc-kr", new DefaultFileRenamePolicy());
				//
				Enumeration files = multi.getFileNames();
				while (files.hasMoreElements()) {
					String name = (String) files.nextElement();
					// file input box �� �̸����� �ϳ��� ������
					if (files.hasMoreElements()) {
						// ���� ������ �̸� ���� �̸��� �� ������
						// ��, ���� enumeration���� ������ �̸��� ������ ��Ұ� �ƴϸ�
						savefiles.add(multi.getFilesystemName(name) + ",");
					} else {
						savefiles.add(multi.getFilesystemName(name));
					}
					// ������ ������ �ƴϸ� ���ϸ� �ڿ� , �� �ٿ��� �߰��ϰ�
					// ������ �����̸� , �� ������ �ʰ� �߰�
				}
				StringBuffer fl = new StringBuffer();
				for (int i = 0; i < savefiles.size(); i++) {
					fl.append(savefiles.get(i));
				}
				int result =0;
				if(multi.getParameter("member_pw").equals(multi.getParameter("member_pwcheck"))){
					m2 = dao.mUpdate(multi.getParameter("member_id"));
					if(m2 != null){
						System.out.println("���̵� �ߺ� �ٸ� ���̵� ����Ͽ� �ּ���.");
						response.setContentType("text/html;charset=euc-kr");
						PrintWriter out = response.getWriter();
						out.println("<script>");
						out.println("alert('���̵� �ߺ� �ٸ� ���̵� ����Ͽ� �ּ���.')");
						out.println("history.back()");
						out.println("</script>");
						return null;
					}else{
						System.out.println("joinpro member_id : "+multi.getParameter("member_id"));
						System.out.println("joinpro member_pw : "+multi.getParameter("member_pw"));
						System.out.println("joinpro member_name : "+multi.getParameter("member_name"));
						System.out.println("��� ����");
						
						
						m.setMember_id(multi.getParameter("member_id"));
						m.setMember_pw(multi.getParameter("member_pw"));
						m.setMember_name(multi.getParameter("member_name"));
						m.setMember_level(multi.getParameter("member_level"));
						m.setMember_phone(multi.getParameter("member_phone"));
						m.setMember_addr(multi.getParameter("member_addr"));
						m.setMember_date(multi.getParameter("member_date"));
						m.setMember_img(fl.toString());

						result = dao.mInsert(m);	
					}				
				}else{
					System.out.println("��� �ٸ�");
					response.setContentType("text/html;charset=euc-kr");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('��й�ȣ Ȯ��')");
					out.println("history.back()");
					out.println("</script>");
					return null;
				}
				if (result <= 0) {
					response.setContentType("text/html;charset=euc-kr");
					PrintWriter out = response.getWriter();
					out.println("<script>");
					out.println("alert('��Ͻ���')");
					out.println("history.back()");
					out.println("</script>");
					return null;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
				forward.setRedirect(true);
				forward.setPath(request.getContextPath() + "/MemberList.me");
			
		return forward;
	}

}
