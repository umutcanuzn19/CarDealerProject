package com.project.CarDealer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Dealer")
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column(name="f_name")
	private String fname ;
	@Column(name="l_name")
	private String lname;
	@Column(name="p_number")
	private int phoneNumber ;
}
