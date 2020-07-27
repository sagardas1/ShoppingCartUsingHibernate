package org.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.alpha.dto.Address;
import org.hibernate.alpha.dto.UserDetails;
import org.hibernate.alpha.dto.Vehicle;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

public class HibernateTest {

	public static void main(String[] args) {

		SessionFactory sessionFacetory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFacetory.openSession();
		session.beginTransaction();
	UserDetails details=(UserDetails)	session.get(UserDetails.class, 6);
	details.setUserId(20);
	session.save(details);
		
	session.getTransaction().commit();
		session.close();
	
	}

}
