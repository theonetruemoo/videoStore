package za.co.mooInc.controllers;

import java.util.ArrayList;

import za.co.mooInc.beans.Genre;
import za.co.mooInc.beans.VideoItem;
import za.co.mooInc.dao.VideoItemDao;

public class VideoItemsController {
	
	
	private ArrayList<VideoItem> videoItems;
	
	private VideoItemDao dao; 
	
	

	public ArrayList<VideoItem> getVideoItems() {
	
		
		return videoItems;
	}

	public void setVideoItems(ArrayList<VideoItem> videoItems) {
		this.videoItems = videoItems;
	}
	
	
	
	
	
	
	

}
