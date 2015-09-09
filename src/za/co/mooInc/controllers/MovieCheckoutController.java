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
import za.co.mooInc.beans.MovieCheckOut;
import za.co.mooInc.beans.Video;

	 

@ManagedBean(name="movieCheckoutController")
@ViewScoped
public class MovieCheckoutController implements Serializable {
     

	private List<MovieCheckOut> checkedOutMovies;
	

     

	@ManagedProperty("#{movieCheckOut}")
	private MovieCheckOut checkOutService;
 
    @PostConstruct
    public void init() {
    	checkedOutMovies = checkOutService.populateMovies();
    	

    }

	public List<MovieCheckOut> getCheckedOutMovies() {
		return checkedOutMovies;
	}

	public void setCheckedOutMovies(List<MovieCheckOut> checkedOutMovies) {
		this.checkedOutMovies = checkedOutMovies;
	}

	public MovieCheckOut getCheckOutService() {
		return checkOutService;
	}

	public void setCheckOutService(MovieCheckOut checkOutService) {
		this.checkOutService = checkOutService;
	}
    
   




	
	
	
	
	
	
 
  
    
}

