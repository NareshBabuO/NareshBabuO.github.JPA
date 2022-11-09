package com.xworkz.jpa.bike.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.jpa.bike.entity.BikeEntity;
import com.xworkz.jpa.bike.util.BikeUtil;

public class BikeRespositoryImpl implements BikeRespository {

	EntityManagerFactory factory = BikeUtil.getFactory();

	@Override
	public boolean Save(List<BikeEntity> list) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			for (BikeEntity entity : list) {
				entityManager.persist(entity);
			}
			entityTransaction.commit();
			System.out.println(list);
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityTransaction.rollback();
		} finally {
			entityManager.close();
		}

		return true;
	}

	@Override
	public boolean Save(BikeEntity entity) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(entity);
			entityTransaction.commit();
		} finally {
			entityManager.close();
		}

		return true;
	}

	@Override
	public Optional<BikeEntity> findById(int id) {

		EntityManager entityManager = factory.createEntityManager();
		// EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			// entityTransaction.begin();
			BikeEntity bikeEntity = entityManager.find(BikeEntity.class, id);
			if (bikeEntity != null) {

				System.out.println("Bike Id is Found =" + bikeEntity);
				return Optional.of(bikeEntity);
			} else {
				System.err.println("Bike Id is Not Found:" + id);
			}
		} finally {
			entityManager.close();

		}

		return Optional.empty();
	}

	@Override
	public void updateByBrandbyId(int id, String name) {

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			BikeEntity bikeEntity = entityManager.find(BikeEntity.class, id);
			if (bikeEntity != null) {
				bikeEntity.setBrand(name);
				entityManager.persist(bikeEntity);
				entityTransaction.commit();
				System.out.println("Bike Brand is Found , We can Update =" + bikeEntity);
			} else {
				System.err.println("Bike Brand is Not Found, We can't Update");
			}
		}

		finally {
			entityManager.close();
		}
	}

	@Override
	public void deleteById(int id) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			BikeEntity bikeEntity = entityManager.find(BikeEntity.class, id);
			if (bikeEntity != null) {
				entityManager.remove(bikeEntity);
				entityTransaction.commit();
				System.out.println("Bike ID found ,We cand Delete it =" + bikeEntity);

			} else {
				System.err.println("Bike Id is Not Found........."+id);
			}
		} finally {
			entityManager.close();
		}
	}

}
