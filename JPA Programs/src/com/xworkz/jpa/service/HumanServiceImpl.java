package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repository.HumanRepositoryImpl;

public class HumanServiceImpl implements HumanService {

	private HumanRepositoryImpl repo;

	public HumanServiceImpl(HumanRepositoryImpl repo) {
		this.repo = repo;
	}

	@Override
	public boolean ValidateAndSave(HumanEntity entity) {
		int id = entity.getId();
		String mainpart = entity.getMainPart();
		String name = entity.getScintificName();
		int bones = entity.getTotalBones();
		String kidney = entity.getKidneyFunction();
		int hand = entity.getTotalHands();
		String head = entity.getHeadpart();
		int legs = entity.getLegs();
		int brainweight = entity.getBrainweight();
		int totalteath = entity.getTotalteath();
		String skincolor = entity.getSkincolor();
		int fingerCount = entity.getFingerCount();
		String tounge = entity.getToungeUse();
		String sex = entity.getSexType();
		int intestine = entity.getTotalIntestines();

		if (id > 0 && id < 50) {
			System.out.println("human ID is Valid");
		} else {
			System.err.println("Human ID is Invalid ");
		}
		if (mainpart != null && mainpart.length() > 0 && mainpart.length() < 50) {
			System.out.println("Human MainPart is Valid");
		} else {
			System.err.println("Human MainPart is Invalid");
		}
		if (name != null && name.length() > 3 && name.length() < 50) {
			System.out.println("Human name is Valid");
		} else {
			System.err.println("Human name is Invalid");
		}
		if (bones > 0 && bones < 500) {
			System.out.println("Human Bones is Valid");
		} else {
			System.err.println("Human Bone is Invalid");
		}
		if (kidney != null && kidney.length() > 3 && kidney.length() < 50) {
			System.out.println("Human Kidney is Valid");
		} else {
			System.err.println("Human Kidney is Invalid");
		}
		if (hand > 0 && hand < 30) {
			System.out.println("Human Hand is Valid");
		} else {
			System.err.println("Human Hand isInvalid");
		}
		if (head != null && head.length() > 3 && head.length() < 50) {
			System.out.println("Human Head is Valid");
		} else {
			System.err.println("Human Head is Invalid");
		}
		if (legs > 0 && legs < 10) {
			System.out.println("Human Legs is Valid");
		} else {
			System.err.println("Human Legs is Valid");
		}
		if (brainweight > 0 && brainweight < 1000) {
			System.out.println("Human Brain is Valid");
		} else {
			System.err.println("Human Brain is Invalid");
		}
		if (totalteath > 0 && totalteath < 50) {
			System.out.println("Human Teath is Valid");
		} else {
			System.err.println("Human Teath is Invalid");
		}
		if (skincolor != null && skincolor.length() > 3 && skincolor.length() < 50) {
			System.out.println("Human SkinColor is Valid");
		} else {
			System.err.println("Human SkinColor is Invalid");
		}
		if (fingerCount > 0 && fingerCount < 50) {
			System.out.println("Human Finger is Valid");
		} else {
			System.err.println("Human Finger is Invalid");
		}
		if (tounge != null && tounge.length() > 3 && tounge.length() < 30) {
			System.out.println("Human Tounge is Valid");
		} else {
			System.err.println("Human Tounge is Invalid");
		}
		if (sex != null && sex.length() > 3 && sex.length() < 30) {
			System.out.println("Human Sex is valid");
		} else {
			System.err.println("Human Sex is Invalid");
		}
		if (intestine > 0 && intestine < 30) {
			System.out.println("Human intestine is Valid");
		} else {
			System.err.println("Human intestine is Invalid");
		}
		this.repo.Save(entity);

		return false;
	}

	@Override
	public Optional<HumanEntity> findById(int id) {
		if (id > 0) {
			System.out.println("ID is valid");
			return this.repo.findById(id);
		}

		return Optional.empty();
	}

	@Override
	public void updateByName(int id, String name) {
		this.repo.updateByname(id, name);

	}

}
