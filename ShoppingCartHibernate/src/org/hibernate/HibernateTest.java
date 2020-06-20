package org.hibernate;

import org.hibernate.alpha.dto.UserDetails;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails details = new UserDetails();

		details.setName("Ram das");
		details.setAddress("Shashikala Apartment");
		details.setJoinDate(System.currentTimeMillis());

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		//to save data in data base
//		s.beginTransaction();
//		s.save(details);
//		s.getTransaction().commit();
//		s.close();
s.beginTransaction();
	UserDetails details2=(UserDetails) s.get(UserDetails.class, 1);
	System.out.println(new Gson().toJson(details2));
	}

}
