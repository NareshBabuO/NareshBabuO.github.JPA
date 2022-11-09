package com.xworkz.jpa.bike.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bike")
public class BikeEntity {

	@Id

	private int id;
	private String brand;
	private int year;
	private String color;
	private String breaksystem;

}
