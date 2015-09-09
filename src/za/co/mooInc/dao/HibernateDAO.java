package za.co.mooInc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateDAO{ 

	
	public HibernateDAO(){
		this.openCurrentSessionwithTransaction();
	}
	
	private Session currentSession;
	
	private Transaction currentTransaction;
	
	
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(Object entity) {
		getCurrentSession().save(entity);
	}

	public void update(Object entity) {
		getCurrentSession().update(entity);
	}

	public Object findById(String id) {
		Object entity = getCurrentSession().get(Object.class, id);
		return entity; 
	}

	public void delete(Object entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAll(String table) {
		List<Object> entitys = getCurrentSession().createQuery("from "+table).list();
		return entitys;
	}

	public void deleteAll(String table) {
		List<Object> entityList = findAll(table);
		for (Object entity : entityList) {
			delete(entity);
		}
	}
}
