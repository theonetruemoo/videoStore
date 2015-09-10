package za.co.mooInc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import za.co.mooInc.beans.Customer;
import za.co.mooInc.beans.Genre;
import za.co.mooInc.beans.Video;
import za.co.mooInc.beans.VideoItem;
import za.co.mooInc.logicClasses.HibernateUtil;

public class GenreDAO extends HibernateDAO {

	public List<Genre> getAllGenre() throws Exception {

		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery(" FROM Genre").list();
	}

}
