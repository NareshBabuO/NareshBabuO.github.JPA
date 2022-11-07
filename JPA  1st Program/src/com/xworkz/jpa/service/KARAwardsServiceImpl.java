package com.xworkz.jpa.service;

import com.xworkz.jpa.entity.KARAwardsEntity;
import com.xworkz.jpa.repository.KARAwardsRepositoryImpl;

public class KARAwardsServiceImpl implements KARAwardsService {

	private KARAwardsRepositoryImpl repo;

	public KARAwardsServiceImpl(KARAwardsRepositoryImpl repo) {
		this.repo = repo;
	}

	@Override
	public boolean ValidateandSave(KARAwardsEntity dto) {

		int id = dto.getId();
		String name = dto.getName();
		String achive = dto.getAchievments();
		boolean alive = dto.isAlive();
		int age = dto.getAge();
		String place = dto.getPlace();
		int year = dto.getYear();

		if (id > 0 && id < 50) {
			System.out.println("KARAwards ID is Valid");
			if (name != null && name.length() > 3 && name.length() < 50) {
				System.out.println("KARAwards Name is Valid");
				if (achive != null && achive.length() > 3 && achive.length() < 50) {
					System.out.println("KARAwards Achive is Valid");
					if (alive == true || alive == false) {
						System.out.println("KARAwards alive is Valid");
						if (age > 0 && age < 100) {
							System.out.println("KARAwards Age is Valid");
							if (place != null && place.length() > 3 && place.length() < 50) {
								System.out.println("KARAwards palce is Valid");
								if (year > 1900 && year < 2023) {
									System.out.println("KARAwards Year is Valid");
									this.repo.Save(dto);
								} else {
									System.err.println("KARAwards year is Invalid");
								}
							} else {
								System.err.println("KARAwards place is Invalid");
							}
						} else {
							System.err.println("KARAwards Age is Invalid");
						}
					} else {
						System.err.println("KARAwards Achive is Invalid");
					}
				} else {
					System.err.println("KARAwards Alive is Invalid");
				}
			} else {
				System.err.println("KARAwards Name is Invalid");
			}
		} else {
			System.err.println("KARAwards ID is Invalid");
		}
		return false;
	}
}
