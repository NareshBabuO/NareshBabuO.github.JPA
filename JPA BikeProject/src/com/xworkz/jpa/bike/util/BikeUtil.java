package com.xworkz.jpa.bike.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BikeUtil {

	public static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}
}