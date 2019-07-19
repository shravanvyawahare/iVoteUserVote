package com.dao;

import java.util.List;

import com.model.AdharCard;

public interface AdharCardDao {

	//public int insert(ManageCandidate p);
	//public int delete(int id);
	//public ManageCandidate getData(int id);
	public  List<AdharCard>  showAll(String adharCardNumber); 
	public List<AdharCard> showAll(); 
	//public void updateData(ManageCandidate p);

}
