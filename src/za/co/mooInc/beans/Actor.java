package za.co.mooInc.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "ACTOR") 
public class Actor {
	
	private int id;
	private String fullName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	

}
