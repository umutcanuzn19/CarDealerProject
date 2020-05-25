package com.project.CarDealer.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dealer")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column(name = "car_brand")
	private ArrayList<String> carBrand ; 
	@Column(name = "car_model")
	private String carModel ;
	@Column(name = "car_code")
	private String carCode ;
	@Column(name="car_price")
	private float carPrice;
	@Column(name="car_case")
	private ArrayList<String> carCase ;
	@Column(name="car_date")
	private LocalDate carDate ;
	@ManyToOne
	@JoinColumn(name="Dealer")
	private Dealer dealerId ;
	
}
