package com.xworkz.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stadium")
public class StadiumEntity {
	@Id
	// @Column(name = "id")
	private int id;
	// @Column(name = "name")
	private String name;
//	@Column(name = "foundedYear")
	private int foundedYear;
//	@Column(name = "capacity")
	private double capacity;
//	@Column(name = "entryFees")
	private int entryFees;
//	@Column(name = "type")
	private String type;

}
