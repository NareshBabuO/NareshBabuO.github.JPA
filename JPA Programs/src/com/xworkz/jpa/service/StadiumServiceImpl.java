package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.repository.StadiumRepositoryImpl;

public class StadiumServiceImpl implements StadiumService {

	private StadiumRepositoryImpl repositoryImpl;

	public StadiumServiceImpl(StadiumRepositoryImpl repositoryImpl) {
		this.repositoryImpl = repositoryImpl;
	}

	@Override
	public boolean ValidateAndSave(StadiumEntity entity) {
		int id = entity.getId();
		String name = entity.getName();
		int year = entity.getFoundedYear();
		double capacity = entity.getCapacity();
		int fee = entity.getEntryFees();
		String type = entity.getType();
		if (id > 0 && id < 100) {
			System.out.println("Stadium Id is Valid");
		} else {
			System.err.println("Stadium Id is Inalid");
		}
		if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("Stadium Name is Valid");
		} else {
			System.err.println("Stadium Name is Inalid");
		}
		if (year > 1800 && year < 2023) {
			System.out.println("Stadium foundedYear is Valid");
		} else {
			System.err.println("Stadium foundedYear is Inalid");
		}
		if (capacity > 20000 && capacity < 1000000) {
			System.out.println("Stadium Capacity is Valid");
		} else {
			System.err.println("Stadium foundedYear is Invalid");
		}
		if (fee > 1000 && fee < 10000) {
			System.out.println("Stadium fee is Valid");
		} else {
			System.err.println("Stadium fee is Invalid");
		}
		this.repositoryImpl.Save(entity);
		if (type != null && type.length() > 0 && type.length() < 30) {
			System.out.println("Stadium Type is Valid");
		} else {
			System.err.println("Sttadium type is Invalid");
		}
		return false;
	}

	@Override
	public Optional<StadiumEntity> findById(int id) {
		if (id > 0) {
			System.out.println("Stadium Entity ID is Valid");
			return this.repositoryImpl.findByid(id);

		}
		return Optional.empty();
	}

	@Override
	public Optional<StadiumEntity> updateByName(int id, String name) {
		this.repositoryImpl.updateByName(id, name);
		return Optional.empty();
	}

	@Override
	public void deleteById(int id) {
		this.repositoryImpl.deleteById(id);
	}

}
