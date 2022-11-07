package com.xworkz.jpa.entity;

import javax.persistence.Column;
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
@Table(name = "human")
public class HumanEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "mainPart")
	private String mainPart;
	@Column(name = "scintificName")
	private String scintificName;
	@Column(name = "totalBones")
	private int totalBones;
	@Column(name = "kidneyFunction")
	private String kidneyFunction;
	@Column(name = "totalHands")
	private int totalHands;
	@Column(name = "headpart")
	private String headpart;
	@Column(name = "legs")
	private int legs;
	@Column(name = "brianweight")
	private int brainweight;
	@Column(name = "totalteath")
	private int totalteath;
	@Column(name = "skincolor")
	private String skincolor;
	@Column(name = "fingerCount")
	private int fingerCount;
	@Column(name = "toungeUse")
	private String toungeUse;
	@Column(name = "sexType")
	private String sexType;
	@Column(name = "totalIntestines")
	private int totalIntestines;

}
