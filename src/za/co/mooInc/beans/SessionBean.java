package za.co.mooInc.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "SessionBean")
@SessionScoped
public class SessionBean {
	
	
	private String  loggedIn = "yes";	
	private boolean loggedInBool = true;
	private int loggedInInt = 1;

	public String getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(String loggedIn) {
		this.loggedIn = loggedIn;
	}

	public boolean isLoggedInBool() {
		return loggedInBool;
	}

	public void setLoggedInBool(boolean loggedInBool) {
		this.loggedInBool = loggedInBool;
	}

	public int getLoggedInInt() {
		return loggedInInt;
	}

	public void setLoggedInInt(int loggedInInt) {
		this.loggedInInt = loggedInInt;
	}
	
	
	
	


	
	
	
	

}
