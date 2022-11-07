package com.xworkz.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metro")
public class MetroEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "startAt")
	private String startAt;
	@Column(name = "EndsAt")
	private String EndsAt;
	@Column(name = "cheaking")
	private boolean cheaking;
	@Column(name = "fuelType")
	private String fuelType;
	@Column(name = "mainCity")
	private String mainCity;
	@Column(name = "totalStop")
	private int totalStop;
	@Column(name = "bagCheck")
	private boolean bagCheck;
	@Column(name = "totalFee")
	private int totalFee;

}
