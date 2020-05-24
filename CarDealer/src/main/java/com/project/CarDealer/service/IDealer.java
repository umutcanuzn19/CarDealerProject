package com.project.CarDealer.service;

import java.util.List;

import com.project.CarDealer.model.*;

public interface IDealer {
	public List<Dealer> findAll();
	
	public Dealer findById(long id);
	
	public void create(Dealer dealer);
	
	public void delete(long id);
	
	public void update(Dealer dealer);

}
