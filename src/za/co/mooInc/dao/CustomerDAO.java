package za.co.mooInc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Video;
import za.co.mooInc.beans.VideoItem;
import za.co.mooInc.logicClasses.HibernateUtil;

public class CustomerDAO extends HibernateDAO{
	
public  void save(Customer bean) throws Exception{	
	super.save(bean);
	
		
	}


public  List<Customer> getAllCustomers() throws Exception{
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	  return session.createQuery(" FROM Customer").list();
	
	
	
		
	}

public  void updateCustomer(Customer cust) throws Exception{
	
	super.update(cust);
		
	}

}
