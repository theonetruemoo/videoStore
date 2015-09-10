package za.co.mooInc.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import za.co.mooInc.beans.Users;
import za.co.mooInc.beans.Video;
import za.co.mooInc.dao.HibernateDAO;
import za.co.mooInc.dao.LoginDAO;


@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController {
	

	private Users user;
	private boolean loggedIn;
	
	 @PostConstruct
	    public void init() {
	    	user = new Users();

	    }
	
	
	public void login(ActionEvent actionEvent){
		LoginDAO ldao = new LoginDAO();
		try{
		//loggedIn = ldao.checkLoginCredentials(user);
			loggedIn = true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	
	
	

}
