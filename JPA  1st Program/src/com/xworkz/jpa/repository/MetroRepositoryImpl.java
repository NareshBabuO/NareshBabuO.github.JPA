package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.MetroEntity;

public class MetroRepositoryImpl implements MetroRepository {

	public MetroRepositoryImpl() {
		System.out.println("MetroRepositoryImpl default Constructor" + this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(MetroEntity entity) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

}
