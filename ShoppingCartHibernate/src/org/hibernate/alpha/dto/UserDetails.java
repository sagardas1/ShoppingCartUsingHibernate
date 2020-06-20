
package org.hibernate.alpha.dto;

import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "UserDetails")
public class UserDetails {
	@Id @Column(name="USER ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Embedded
	private Address address;
	@Column(name="NAME")
	private String name;
	@Column(name="JOINDATE")
	private Long joinDate;

}
