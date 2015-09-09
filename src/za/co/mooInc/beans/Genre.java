package za.co.mooInc.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "GENRE") 
public class Genre {
	
	private int id;
	private String description;
	
	
	public Genre(int id, String description){
		this.id = id;
		this.description = description;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
