package za.co.mooInc.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "VIDEO_ITEM") 
public class VideoItem {
	
	 private int id;
	 private String serialNumber;
	 private int videoId;
	 private Date createDate;
	 

	 
	 
	public VideoItem(int id, String serialNumber, int videoId, Date createDate) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.videoId = videoId;
		this.createDate = createDate;
	}
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	 
	 
	 
	 

}
