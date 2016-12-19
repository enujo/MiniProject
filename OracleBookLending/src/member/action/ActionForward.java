package member.action;

public class ActionForward {
	private boolean isRedirect = false;
	private String path = null;

	public boolean isRedirect() {
		return isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setRedirect(boolean b) {
		System.out.println("ActionForward.java setRedirect : "+b);
		isRedirect = b;
	}

	public void setPath(String string) {
		System.out.println("ActionForward.java setPath : "+string);
		path = string;
	}
}