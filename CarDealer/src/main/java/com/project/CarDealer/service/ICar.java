package com.project.CarDealer.service;

import java.util.List;
import com.project.CarDealer.model.*;




public interface ICar {
	public List<Car> findAll();
	
	public Car findById(long id);
	
	public List<Car> findByDealerId(long id);
	
	public void create(Car car);
	
	public void delete(long id);
	
	public void update(Car car);
	
	public void deleteByDealerId(long id);

}
