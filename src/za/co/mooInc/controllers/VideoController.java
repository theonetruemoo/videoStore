package za.co.mooInc.controllers;


	

	 
	import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Video;

	 

@ManagedBean(name="videoController")
@ViewScoped
public class VideoController implements Serializable {
     

	private List<Video> videos;

     

	@ManagedProperty("#{video}")
	private Video videoService;
	private Video createVideo;
 
    @PostConstruct
    public void init() {
    	createVideo = new Video();
    	videos = videoService.createVideos();

    }
    
    
    public void save(ActionEvent actionEvent){
    	videos.add(createVideo);
    	
	}
	
	

 
    public List<Video> getvideos() {
        return videos;
    }
 

 
    public void setVideoService(Video videoService) {
        this.videoService = videoService;
    }

	public Video getCreateVideo() {
		return createVideo;
	}

	public void setCreateVideo(Video createVideo) {
		this.createVideo = createVideo;
	}
    
    
    
}

