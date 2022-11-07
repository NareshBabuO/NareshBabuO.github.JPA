package com.xworkz.jpa.entity;

import javax.persistence.*;
//import javax.persistence.Id;
//import javax.persistence.Table;

import lombok.*;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "awardees")
public class KARAwardsEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "achievments")
	private String achievments;
	@Column(name = "alive")
	private boolean alive;
	@Column(name = "age")
	private int age;
	@Column(name = "place")
	private String place;
	@Column(name = "year")
	private int year;

}
