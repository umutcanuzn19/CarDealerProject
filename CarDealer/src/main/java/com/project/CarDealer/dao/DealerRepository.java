package com.project.CarDealer.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.project.CarDealer.service.IDealer;

import com.project.CarDealer.model.*;
public class DealerRepository implements IDealer {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Dealer> findAll() {
		return entityManager.createQuery("from Dealer",Dealer.class).getResultList();
	}

	@Override
	public Dealer findById(long id) {
		return entityManager.find(Dealer.class, id);
	}

	@Override
	public void create(Dealer dealer) {
		entityManager.persist(dealer);
	}

	@Override
	public void delete(long id) {
		entityManager.remove(entityManager.getReference(Dealer.class, id));
	}

	@Override
	public void update(Dealer dealer) {
		entityManager.merge(dealer);
	}

}
