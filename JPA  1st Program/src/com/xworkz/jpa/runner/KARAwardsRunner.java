package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.KARAwardsEntity;
import com.xworkz.jpa.repository.KARAwardsRepositoryImpl;
import com.xworkz.jpa.service.KARAwardsServiceImpl;

public class KARAwardsRunner {

	public static void main(String[] args) {

		KARAwardsEntity awardsDTO = new KARAwardsEntity(1, "Kuvempu", "Literature", false, 75, "Kupalli", 1992);
		KARAwardsEntity awardsDTO1 = new KARAwardsEntity(2, "DR.Rajkumar", "Cinema", false, 78, "Bangalore", 1992);
		KARAwardsEntity awardsDTO2 = new KARAwardsEntity(3, "S.Nijalingappa", "Politics", false, 82, "Bellary", 1999);
		KARAwardsEntity awardsDTO3 = new KARAwardsEntity(4, "C.N.R.Rao", "Science", true, 74, "Bangalore", 2000);
		KARAwardsEntity awardsDTO4 = new KARAwardsEntity(5, "Devi Shetty", "Medicine", true, 68, "Kinnigoli", 2001);
		KARAwardsEntity awardsDTO5 = new KARAwardsEntity(6, "Bhimsen Joshi", "music", true, 84, "Rona city", 2005);
		KARAwardsEntity awardsDTO6 = new KARAwardsEntity(7, "Dr.Shivakumara Swamiji", "Social service", false, 98,
				"Magadi", 2007);
		KARAwardsEntity awardsDTO7 = new KARAwardsEntity(8, "Dr.Veerendra Hegde", "Social service", true, 71, "Bantwal",
				2009);
		KARAwardsEntity awardsDTO8 = new KARAwardsEntity(9, "Dr.Puneeth Rajkumar", "Cenema & Social service", false, 44,
				"Bangalore", 2022);

		KARAwardsRepositoryImpl awardsRepositoryImpl = new KARAwardsRepositoryImpl();
		KARAwardsServiceImpl awardsServiceImpl = new KARAwardsServiceImpl(awardsRepositoryImpl);
		awardsServiceImpl.ValidateandSave(awardsDTO);
		awardsServiceImpl.ValidateandSave(awardsDTO1);
		awardsServiceImpl.ValidateandSave(awardsDTO2);
		awardsServiceImpl.ValidateandSave(awardsDTO3);
		awardsServiceImpl.ValidateandSave(awardsDTO4);
		awardsServiceImpl.ValidateandSave(awardsDTO5);
		awardsServiceImpl.ValidateandSave(awardsDTO6);
		awardsServiceImpl.ValidateandSave(awardsDTO7);
		awardsServiceImpl.ValidateandSave(awardsDTO8);

		

	}

}
