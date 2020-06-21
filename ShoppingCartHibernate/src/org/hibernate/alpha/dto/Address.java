package org.hibernate.alpha.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Address {
	private String street;
	private String state;
private long pincode;

}
