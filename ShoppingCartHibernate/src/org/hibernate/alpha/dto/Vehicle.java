package org.hibernate.alpha.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vehicle {
	@Id
	@GeneratedValue
	private int vehicleId;
	private String  vehicleName;
	

}
