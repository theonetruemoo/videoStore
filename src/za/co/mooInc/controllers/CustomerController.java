package za.co.mooInc.controllers;


	

	 
	import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Video;
import za.co.mooInc.dao.CustomerDAO;

	 

@ManagedBean(name="customerController")
@ViewScoped
public class CustomerController implements Serializable {
     

	private ArrayList<Customer> customers;
	private Customer createCustomer;
	private CustomerDAO cdao;

     

	@ManagedProperty("#{customer}")
	private Customer customerService;
 
    @PostConstruct
    public void init() {
    	cdao= new CustomerDAO();
    
    	//customers = customerService.createCustomer();
    	createCustomer = new Customer();

    }
    
    public void save(ActionEvent actionEvent){
    	try{
    	cdao.save(createCustomer);
    	
    	customers = null;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
		//customers.add(createCustomer);
		
	}
    
    public void update(ActionEvent actionEvent){
    	try{
    		for(int a = 0; a<customers.size(); a++){
    	cdao.update(customers.get(a));
    		}
    	
    	customers = null;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
		//customers.add(createCustomer);
		
	}
	



	public ArrayList<Customer> getCustomers() {
		
		if(customers == null){
			
			try{
				customers = new ArrayList<Customer>();
				customers = (ArrayList<Customer>) cdao.getAllCustomers();
				
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomerService() {
		return customerService;
	}

	public void setCustomerService(Customer customerService) {
		this.customerService = customerService;
	}
	
	
	public Customer getCreateCustomer() {
		return createCustomer;
	}

	public void setCreateCustomer(Customer createCustomer) {
		this.createCustomer = createCustomer;
	}
	
	
 
  
    
}

