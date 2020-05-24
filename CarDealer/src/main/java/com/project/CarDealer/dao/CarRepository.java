package com.project.CarDealer.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.project.CarDealer.service.ICar;

import com.project.CarDealer.model.Car;

@Repository
public class CarRepository implements ICar{
	
	@PersistenceContext
	private EntityManager entityManager ;
	
	@Override
	public List<Car> findAll() {
		
		return entityManager.createQuery("from Car",Car.class).getResultList();
	}

	@Override
	public Car findById(long id) {
		return entityManager.find(Car.class, id);
	}
	@Override
	public List<Car> findByDealerId(long id) {
	return entityManager.createQuery("from Car where dealer.id = :id ",Car.class).setParameter("id", id).getResultList();
	}
	
	@Override
	public void create(Car car) {
		entityManager.persist(car);
	}

	@Override
	public void delete(long id) {
		entityManager.remove(entityManager.getReference(Car.class, id));
	}

	@Override
	public void update(Car car) {
		entityManager.merge(car);
	}

	@Override
	public void deleteByDealerId(long id) {
		entityManager.createQuery("delete from Car where dealer.id = :id").setParameter("id",id).executeUpdate();
	}

	

}
