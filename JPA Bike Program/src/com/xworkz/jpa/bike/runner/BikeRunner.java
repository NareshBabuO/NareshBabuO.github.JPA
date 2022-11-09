package com.xworkz.jpa.bike.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.bike.entity.BikeEntity;
import com.xworkz.jpa.bike.repository.BikeRespositoryImpl;
import com.xworkz.jpa.bike.service.BikeServiceImpl;
import com.xworkz.jpa.bike.util.BikeUtil;

public class BikeRunner {

	public static void main(String[] args) {

		BikeEntity bikeEntity1 = new BikeEntity(1, "Pulsar NS", 2019, "Greay", "Dual ABS");
		BikeEntity bikeEntity2 = new BikeEntity(2, "Yamaha FZ", 2017, "Blue", "Single ABS");
		BikeEntity bikeEntity3 = new BikeEntity(3, "Duke KTM", 2020, "Red", "Dual ABS");
		BikeEntity bikeEntity4 = new BikeEntity(4, "Royal Enfield", 2013, "Block & Red", "Dual ABS");
		BikeEntity bikeEntity5 = new BikeEntity(5, "Dominor", 2019, "Greay", "Dual ABS");
		BikeEntity bikeEntity6 = new BikeEntity(6, "Spender", 2011, "RedWhite", "No ABS");

		BikeRespositoryImpl bikeRespositoryImpl = new BikeRespositoryImpl();

		BikeServiceImpl service = new BikeServiceImpl(bikeRespositoryImpl);
		try {
			service.ValidateAndSave(bikeEntity1);
			service.ValidateAndSave(bikeEntity2);
			service.ValidateAndSave(bikeEntity3);
			// service.ValidateAndSave(bikeEntity4);
			// service.ValidateAndSave(bikeEntity5);
			service.ValidateAndSave(bikeEntity6);

			List<BikeEntity> list = Arrays.asList(bikeEntity4, bikeEntity5);
			service.ValidateAndSave(list);

			Optional<BikeEntity> findById = service.findById(3);
			if (findById.isPresent()) {
				BikeEntity bikeEntity = findById.get();
				System.out.println(bikeEntity);
			}

			service.updateByBrandById(4, "Himalayas");
			service.deleteById(6);

		} finally {
			BikeUtil.getFactory().close();

		}
	}

}
