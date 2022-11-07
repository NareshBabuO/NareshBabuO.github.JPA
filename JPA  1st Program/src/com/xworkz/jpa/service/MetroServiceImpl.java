package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.repository.MetroRepositoryImpl;

public class MetroServiceImpl implements MetroService {

	private MetroRepositoryImpl repo;

	public MetroServiceImpl(MetroRepositoryImpl repo) {
		this.repo = repo;
	}

	@Override
	public boolean ValidateAndSave(MetroEntity entity) {
		System.out.println("Validating Method in Metro");
		int id = entity.getId();
		String name = entity.getName();
		boolean cheaking = entity.isCheaking();
		String fuelType = entity.getFuelType();
		String city = entity.getMainCity();
		int stop = entity.getTotalStop();
		boolean bagcheak = entity.isBagCheck();
		int fee = entity.getTotalFee();
		if (id > 0 && id < 100) {
			System.out.println("Metro ID is Valid");
		} else {
			System.err.println("Metro ID is Invalid");
		}
		if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("Metro Name is Valid");
		} else {
			System.err.println("Metro Name is Invalid");
		}
		if (cheaking == true || cheaking == false) {
			System.out.println("Metro cheaking is Valid");
		} else {
			System.err.println("Metro Cheaking is Invalid");
		}
		if (fuelType != null && fuelType.length() > 3 && fuelType.length() < 50) {
			System.out.println("Metro FuelType is Valid");
		} else {
			System.err.println("Metro FuelType is Invalid");
		}
		if (city != null && city.length() > 3 && city.length() < 50) {
			System.out.println("Metro City is Valid");
		} else {
			System.err.println("Metro City is Invalid");
		}
		if (stop > 2 && stop < 30) {
			System.out.println("Metro Stop is Valid");
		} else {
			System.err.println("Metro Stop is Invalid");
		}
		if (bagcheak == true || bagcheak == false) {
			System.out.println("Meto BagCheck is Valid");
		} else {
			System.err.println("Metro BagCheck is Invalid");
		}
		if (fee > 10 && fee < 1000) {
			System.out.println("Metro Fee is Valid");
		} else {
			System.err.println("Metro Fee is Invalid");
		}
		this.repo.Save(entity);
		return false;
	}

}
