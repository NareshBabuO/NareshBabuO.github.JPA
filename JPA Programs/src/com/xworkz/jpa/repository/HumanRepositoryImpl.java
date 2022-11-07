package com.xworkz.jpa.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.util.HumanUtil;

public class HumanRepositoryImpl implements HumanRepository {

	EntityManagerFactory factory = HumanUtil.getFactory();

	@Override
	public boolean Save(HumanEntity entity) {

		try {

			EntityManager entityManager = factory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();

			entityTransaction.begin();
			entityManager.persist(entity);
			entityTransaction.commit();
			entityManager.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {
		EntityManager entityManager = factory.createEntityManager();
		HumanEntity humanEntity = entityManager.find(HumanEntity.class, id);
		if (humanEntity != null) {
			System.out.println("Entity is found   :" + humanEntity);
			return Optional.of(humanEntity);

		} else {
			System.err.println("Entity is not found   :" + id);
		}

		return Optional.empty();
	}

//	@Override
//	public Optional<HumanEntity> updateByname(String name) {
//		EntityManager entityManager = factory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityTransaction.begin();
//		HumanEntity entity = entityManager.find(HumanEntity.class, id);
//
//		return null;
//	}

	@Override
	public void updateByname(int id, String name) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		HumanEntity humanEntity = entityManager.find(HumanEntity.class, id);
		if (humanEntity != null) {
			humanEntity.setScintificName(name);
			entityManager.merge(humanEntity);
			System.out.println("Human Entity Found , We can Update:" + humanEntity);
		} else {
			System.err.println("Human Entity Not Found, We can't Update");
		}
		entityTransaction.commit();
		entityManager.close();
	}

}
