package za.co.mooInc.controllers;

import java.sql.Date;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import za.co.mooInc.beans.Video;

@ManagedBean(name = "videoController")
public class VideoController {
	
	
	private ArrayList<Video> videos;

	public ArrayList<Video> getVideos() {
		
		if(videos == null){
			for(int a = 0;a<10; a++){
				Video avid = new Video(a, "name"+a, a,(long) a*10 ,a, new Date(1213214L));
				videos.add(avid);
			}
		}
		return videos;
	}

	public void setVideos(ArrayList<Video> videos) {
		this.videos = videos;
	}
	
	
	

}
