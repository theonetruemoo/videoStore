package za.co.mooInc.dao;

import java.util.List;

import org.hibernate.Session;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Video;
import za.co.mooInc.beans.VideoItem;
import za.co.mooInc.logicClasses.HibernateUtil;

public class VideoDAO extends HibernateDAO{
	
	public  void save(Video bean) throws Exception{	
		super.save(bean);
		
			
		}


	public  List<Video> getAllVideo() throws Exception{
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		  return session.createQuery(" FROM Video").list();
		
		
		
			
		}

	public  void updateVideo(Video bean) throws Exception{
		
		super.update(bean);
			
		}

}
