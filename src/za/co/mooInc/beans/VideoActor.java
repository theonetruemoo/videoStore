package za.co.mooInc.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "VIDEO_ACTOR") 

public class VideoActor {
	
	
	 private int videoId;
	 private int actorId;
	 
	 @Id 
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	 
	 
	 

}
