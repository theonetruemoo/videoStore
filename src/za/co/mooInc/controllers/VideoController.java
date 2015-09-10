package za.co.mooInc.controllers;


	

	 
	import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Video;
import za.co.mooInc.dao.CustomerDAO;
import za.co.mooInc.dao.VideoDAO;

	 

@ManagedBean(name="videoController")
@ViewScoped
public class VideoController implements Serializable {
     

	private List<Video> videos;

     

	@ManagedProperty("#{video}")
	private Video videoService;
	private Video createVideo;
	private VideoDAO vdao;
	
	
 
    @PostConstruct
    public void init() {
    	vdao= new VideoDAO();
    	
    	createVideo = new Video();
    	System.out.println("initiated");
    	

    }
    
    
   
    public void save(ActionEvent actionEvent){
    	try{
    		vdao.save(createVideo);
    		videos = vdao.getAllVideo();
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	
    	
	}
    
    public void updateVideo(ActionEvent actionEvent){
    	System.out.println("updateVideo");
		//customers.add(createCustomer);
		
	}
    
    public void update(ActionEvent actionEvent){
    	
    	System.out.println("Button clicked");
    	try{
    		for(int a = 0; a<videos.size(); a++){
    	vdao.update(videos.get(a));
    		}
    	
    	videos = null;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}

		
	}
    
    
	
	

 
    public List<Video> getvideos() {
    	
    	if(videos == null){
    		try{
    		videos = new ArrayList<Video>();
    		videos = vdao.getAllVideo();
    		}
    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}
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

