package za.co.mooInc.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;


@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController {
	
	private String username;
	private String password;
	private boolean loggedIn;
	
	
	public void login(ActionEvent actionEvent){
		System.out.println("u name"+username +" password "+password);
		
		if(loggedIn){
			loggedIn = false;
		}
		else{
		loggedIn = true;
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	
	
	
	
	
	
	
	

}
