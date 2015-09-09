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

	 

@ManagedBean(name="customerFilter")
@ViewScoped
public class CustomerFilters implements Serializable {
     

	private List<Customer> customers;
	private Customer createCustomer;

     

	@ManagedProperty("#{customer}")
	private Customer customerService;
 
    @PostConstruct
    public void init() {
    	customers = customerService.createCustomer();
    	createCustomer = new Customer();

    }

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer getCustomerService() {
		return customerService;
	}

	public void setCustomerService(Customer customerService) {
		this.customerService = customerService;
	}
	
	public void save(ActionEvent actionEvent){
		customers.add(createCustomer);
	}
	
	public void createCustomerAction(ActionEvent actionEvent){
		 createCustomer = new Customer();
	}

	public Customer getCreateCustomer() {
		return createCustomer;
	}

	public void setCreateCustomer(Customer createCustomer) {
		this.createCustomer = createCustomer;
	}
	
	
 
  
    
}

