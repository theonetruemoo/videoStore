package za.co.mooInc.beans;


import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CUSTOMER") 
@ApplicationScoped
@ManagedBean(name = "customer")

public class Customer {
	
	
	
	private int id;
	private String firstName;
	private String surname;
	private String contactNumber;
	private String idNumber;
	
	
 public ArrayList<Customer> createCustomer(){
		 
		 ArrayList list = new ArrayList<Customer>();
	
			for(int a = 0;a<10; a++){
				Customer aBean = new Customer();
				aBean.setFirstName("name "+a);
				list.add(aBean);
			}
			
			Customer aBean = new Customer();
			aBean.setFirstName("aname "+400);
			list.add(aBean);
		return list;
	 }
 @Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	

}
