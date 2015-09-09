package za.co.mooInc.beans;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "VIDEO") 
@ApplicationScoped
@ManagedBean(name = "video")
public class Video implements Serializable {
	
	
	 private int id; 
	 private String name;
	 private int genreId;
	 private long minutes;
	 private int actorsId;
	 private Date releaseDate;
	 
	 
	 public ArrayList<Video> createVideos(){
		 
		 ArrayList videos = new ArrayList<Video>();
	
			for(int a = 0;a<10; a++){
				Video avid = new Video(a, "name"+a, a,(long) a*10 ,a, new Date(1213214L));
				videos.add(avid);
			}
			
			Video avid = new Video(1000, "ame Name", 300,(long) 4 ,35, new Date(12132L));
		videos.add(avid);
		return videos;
	 }
	 
	public Video(){
		
	}
	public Video(int id, String name, int genreId, long minutes, int actorsId,
			Date releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.genreId = genreId;
		this.minutes = minutes;
		this.actorsId = actorsId;
		this.releaseDate = releaseDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGenreId() {
		return genreId;
	}
	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}
	public long getMinutes() {
		return minutes;
	}
	public void setMinutes(long minutes) {
		this.minutes = minutes;
	}
	public int getActorsId() {
		return actorsId;
	}
	public void setActorsId(int actorsId) {
		this.actorsId = actorsId;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	 
	 
	 

}
