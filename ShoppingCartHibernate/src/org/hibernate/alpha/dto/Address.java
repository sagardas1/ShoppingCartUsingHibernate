package org.hibernate.alpha.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {
@Column(name="STREET")
	private String street;
@Column(name="STATE")
	private String state;
@Column(name="PINCODE")
private long pincode;

}
