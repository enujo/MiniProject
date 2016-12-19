package book.action;

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
		System.out.println("setRedirect");
		isRedirect = b;
	}

	public void setPath(String string) {
		System.out.println("setPath");
		path = string;
	}
}