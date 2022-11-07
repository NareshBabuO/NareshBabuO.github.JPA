package com.xworkz.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StadiumUtil {

	private static EntityManagerFactory factory;

	public static EntityManagerFactory getFactory() {
		return factory;
	}

	static {
		factory = Persistence.createEntityManagerFactory("com.xworkz");
	}

}
