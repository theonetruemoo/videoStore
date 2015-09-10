package za.co.mooInc.beans;

import java.sql.Date;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MOVIE_CHECK_OUT") 
@ApplicationScoped
@ManagedBean(name = "movieCheckOut")
public class MovieCheckOut {
	
	private int id;
	private int customerId;
	private int videoId;
	private Date dateCheckedOut;
	private Date dateReturned;
	
	public ArrayList<MovieCheckOut> populateMovies() {
		 ArrayList<MovieCheckOut> aList = new ArrayList<MovieCheckOut>();
		 
		 for(int a = 0; a<4; a++){
			MovieCheckOut aMovie = new MovieCheckOut();
			aMovie.setVideoId(a);
			aList.add(aMovie);
		 }
		 
		 return aList;
	}
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public Date getDateCheckedOut() {
		return dateCheckedOut;
	}
	public void setDateCheckedOut(Date dateCheckedOut) {
		this.dateCheckedOut = dateCheckedOut;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	
	
	

}
