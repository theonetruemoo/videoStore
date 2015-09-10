package za.co.mooInc.dao;

import java.util.ArrayList;

import za.co.mooInc.beans.Users;
import za.co.mooInc.beans.Video;
import za.co.mooInc.beans.VideoItem;

public class LoginDAO extends HibernateDAO{
	
public  boolean checkLoginCredentials(Users user) throws Exception{
	
	ArrayList<Object> usersObjList = super.getListByHql("from User where username = '"+user.getUsername()+"' and password = '"+user.getPassword()+"'");
	if(usersObjList.size() < 1){
		return false;
	}
	
	return true;
	
	
		
	}

}
