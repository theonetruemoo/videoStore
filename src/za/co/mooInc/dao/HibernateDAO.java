package za.co.mooInc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import za.co.mooInc.beans.Video;
import za.co.mooInc.logicClasses.HibernateUtil;



public  class HibernateDAO{ 

	
	 public   void save(Object o){        
		  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        session.save(o);
	        session.getTransaction().commit();
    
  }
	 
	 
	 public  void update(Object o){        
		  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        session.update(o);
	        session.getTransaction().commit();
   
 }
	 
	 public  void delete(Object o){        
		  Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        session.delete(o);
	        session.getTransaction().commit();
  
}
	 
	 public List<Object> getListByTableName (String tableName)  
	 {  
		 
		 
		 Session session = HibernateUtil.getSessionFactory().openSession();
		  return session.createSQLQuery("SELECT * FROM "+tableName).list();
	       
	    
	 }  
	 
	 public ArrayList<Object> getListByHql (String hql)  
	 {  
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 Query query = session.createQuery("from Stock where stockCode = '7277' ");
		 ArrayList list = (ArrayList) query.list();
		 
		 return list;
	 }  
	 
	 
	public int maxId(String tableName){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 Query query = session.createSQLQuery("select max(id) from "+tableName);
		 ArrayList list = (ArrayList) query.list();
		 
		 return ((int)list.get(0))+1;
	}

	

}
