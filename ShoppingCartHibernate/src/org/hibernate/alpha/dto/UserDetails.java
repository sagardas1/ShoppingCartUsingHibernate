
package org.hibernate.alpha.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="StudentDetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String name;
	private Long joinDate;
	
	@OneToMany
	private Collection<Vehicle> vehicle =new ArrayList<Vehicle>();

}
