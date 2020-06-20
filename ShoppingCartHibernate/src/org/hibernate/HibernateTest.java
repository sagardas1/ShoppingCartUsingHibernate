package org.hibernate;

import org.hibernate.alpha.dto.UserDetails;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails details=new UserDetails();
		details.setName("sagar");
		details.setUserId(1);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session s=	sessionFactory.openSession();
	s.beginTransaction();
	s.save(details);
	s.getTransaction().commit();
	
	

	}

}
