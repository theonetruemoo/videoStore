package za.co.mooInc.controllers;


	

	 
	import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;





import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;






import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.MovieCheckOut;
import za.co.mooInc.beans.Video;


	 

@ManagedBean(name="movieCheckoutController")
@ViewScoped
public class MovieCheckoutController implements Serializable {
     

	private List<MovieCheckOut> checkedOutMovies;
	private Customer selectedCustomer;
	

     

	@ManagedProperty("#{movieCheckOut}")
	private MovieCheckOut checkOutService;
 
    @PostConstruct
    public void init() {
    	//checkedOutMovies = checkOutService.populateMovies();
    	

    }
    
    public List<Video> getCheckedOutVideos(){
    	List<Video> checkedOut = new ArrayList<Video>();
    	if(selectedCustomer!=null){
    	System.out.println("cust Id"+selectedCustomer.getId());
    	}
    	return checkedOut;
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

	public Customer getSelectedCustomer() {
		return selectedCustomer;
	}

	public void setSelectedCustomer(Customer selectedCustomer) {
		this.selectedCustomer = selectedCustomer;
	}
    
	
	
   




	
	
	
	
	
	
 
  
    
}

