package za.co.mooInc.controllers;


	

	 
	import java.io.Serializable;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import za.co.mooInc.beans.Video;

	 
//@ManagedBean(name="dtSortView")
@ManagedBean(name="videoFilter")
@ViewScoped
public class VideoFilters implements Serializable {
     
    //private List<Car> cars1;
	private List<Video> videos;
    //private List<Car> cars2;
     
    //@ManagedProperty("#{carService}")
	@ManagedProperty("#{video}")
    //private CarService service;
	private Video videoService;
 
    @PostConstruct
    public void init() {
        //cars1 = service.createCars(10);
    	videos = videoService.createVideos();
        //cars2 = service.createCars(50);
    }
 
    public List<Video> getvideos() {
        return videos;
    }
 
    //public List<Car> getCars2() {
    //    return cars2;
    //}
 
    public void setVideoService(Video videoService) {
        this.videoService = videoService;
    }
    
}

