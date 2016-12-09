package com.tistory.luahius.controller;

public class ActionForward {
	private boolean isRedirect = false;
	private String path = null;
	
	public void setRedirect(boolean isRedirect){
		System.out.print("ActionForward.java setRedirect : "+isRedirect);
		this.isRedirect = isRedirect;
	}
	public boolean getRedirect(){
		return isRedirect;
		
	}
	public void setPath(String path){
		System.out.println("ActionForward.java setPath : "+path);
		this.path = path;
	}
	public String getPath(){
		return path;
	}

}
