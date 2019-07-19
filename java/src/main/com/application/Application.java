package com.application;

import java.util.List;
import javax.persistence.criteria.*;
import org.hibernate.*;

import com.dao.AdharCardDao;
import com.dao.AdharCardImpl;
import com.model.AdharCard;
import com.util.HibenateUtil;


public class Application {

	public static void main(String[] args) {		
		AdharCardDao ad= new AdharCardImpl()	;
		List<AdharCard> manageCandidate=ad.showAll();		
		 for (AdharCard manage_Candidate : manageCandidate) {
	            System.out.println(manage_Candidate);
	         }

		 List<AdharCard> l=ad.showAll("551634244425");		
//		 for (AdharCard manage_Candidate : l) {
//	            System.out.println(manage_Candidate);
//	         } 
		 
	}
}
