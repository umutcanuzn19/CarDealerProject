package com.project.CarDealer.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CarDealer.dao.CarRepository;
import com.project.CarDealer.dao.DealerRepository;
import com.project.CarDealer.model.Car;
import com.project.CarDealer.model.Dealer;

@Service
@Transactional
public class CarDealerService {
	@Autowired
	CarRepository carRepository ;
	@Autowired
	DealerRepository dealerRepository;
	
	public List<Dealer> findAllDealers(){
		return dealerRepository.findAll();
	}
	public Dealer findDealerById(long id) {
		return dealerRepository.findById(id);
	}
	public void createDealer(Dealer dealer) {
		dealerRepository.create(dealer);
	}
	public void createCar(Car car) {
		carRepository.create(car);
	}
	public void deleteDealer(long id) {
		carRepository.deleteByDealerId(id);
		dealerRepository.delete(id);
	}
	public void deleteCar(long id) {
		carRepository.delete(id);
	}
}
