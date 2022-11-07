package com.xworkz.jpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.jpa.entity.KARAwardsEntity;

public class KARAwardsRepositoryImpl implements KARAwardsRepository {

	public KARAwardsRepositoryImpl() {
		System.out.println("KARAwardsRepository Defalut Constr..." + this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(KARAwardsEntity dto) {
		System.out.println("KARAwards Saving the Details");
		EntityManagerFactory factoryAbstraction = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager managerAbstraction = factoryAbstraction.createEntityManager();
		EntityTransaction transaction = managerAbstraction.getTransaction();

		transaction.begin();
		managerAbstraction.persist(dto);
		transaction.commit();
		managerAbstraction.close();

		return true;
	}

}
