package com.xworkz.jpa.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.util.StadiumUtil;

public class StadiumRepositoryImpl implements StadiumRepository {

	EntityManagerFactory factory = StadiumUtil.getFactory();
	// EntityManager manager = null;

	@Override
	public boolean Save(StadiumEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();

		return true;
	}

	@Override
	public Optional<StadiumEntity> findByid(int id) {
		EntityManager entityManager = factory.createEntityManager();
		StadiumEntity stadiumEntity = entityManager.find(StadiumEntity.class, id);
		if (stadiumEntity != null) {
			System.out.println("Stadium ID is Found : " + stadiumEntity);
		} else {
			System.err.println("Stadium ID is Not found=" + id);
		}

		return Optional.empty();
	}

	@Override
	public Optional<StadiumEntity> updateByName(int id, String name) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StadiumEntity stadiumEntity = entityManager.find(StadiumEntity.class, id);
		if (stadiumEntity != null) {
			stadiumEntity.setName(name);
			entityManager.merge(stadiumEntity);
			System.out.println("Stadium Entity Name is Found, We Can Update Now=" + stadiumEntity);
		} else {
			System.err.println("Human Entity Not Found, We can't Update");
		}
		entityTransaction.commit();
		entityManager.close();
		return Optional.empty();
	}

	@Override
	public void deleteById(int id) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		StadiumEntity stadiumEntity = entityManager.find(StadiumEntity.class, id);
		if (stadiumEntity != null) {
			System.out.println("Stadium Entity ID is Removed from Table=" + stadiumEntity);
			entityManager.remove(stadiumEntity);
		} else {
			System.err.println("Entity ID is not found........");
		}
		entityTransaction.commit();
		entityManager.close();
	}

}
