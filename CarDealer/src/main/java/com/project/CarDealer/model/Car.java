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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "carT")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "car_brand")
	private ArrayList<String> carBrand;
	@Column(name = "car_model")
	private String carModel;
	
	@Column(name = "car_code")
	private String carCode;
	@Column(name = "car_price")
	private float carPrice;
	@Column(name = "car_case")
	private ArrayList<String> carCase;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@Column(name = "car_date")
	private LocalDate carDate;
	@ManyToOne
	@JoinColumn(name = "dealer_id")
	private Dealer dealerId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<String> getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(ArrayList<String> carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarCode() {
		return carCode;
	}

	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}

	public ArrayList<String> getCarCase() {
		return carCase;
	}

	public void setCarCase(ArrayList<String> carCase) {
		this.carCase = carCase;
	}

	public LocalDate getCarDate() {
		return carDate;
	}

	public void setCarDate(LocalDate carDate) {
		this.carDate = carDate;
	}

	public Dealer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Dealer dealerId) {
		this.dealerId = dealerId;
	}

}
