package org.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.alpha.dto.Address;
import org.hibernate.alpha.dto.UserDetails;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails details = new UserDetails();

		details.setName("Sidharth das");
	
		details.setJoinDate(System.currentTimeMillis());
		Address address=new Address();
		address.setPincode(560095);
		address.setState("Karnataka");
		address.setStreet("banglore");
		
		
		Address address1=new Address();
		address1.setPincode(560091);
		address1.setState("Karnataka");
		address1.setStreet("Maratheli");
		Set<Address> addressSet=new HashSet<Address>();
		addressSet.add(address);
		addressSet.add(address1);
		details.setAddressList(addressSet);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
	//	 to save data in data base
		s.beginTransaction();
		s.save(details);
		s.getTransaction().commit();
		s.close();
		
		//get object form db
//		s.beginTransaction();
//		UserDetails details2 = (UserDetails) s.get(UserDetails.class, 1);
//		System.out.println(new Gson().toJson(details2));
	}

}
