package com.dao;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.query.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.*;


import com.model.AdharCard;
import com.util.HibenateUtil;

public class AdharCardImpl implements AdharCardDao
{

//	public List<AdharCard> showAll(long adharCardNumber) {
	public List<AdharCard> showAll() {

		Session session =null;// sessionFactory.openSession();
		Transaction tx=null;
		List<AdharCard> eList=null;
		try{
			session=HibenateUtil.getSession();
			tx = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<AdharCard> query = builder.createQuery(AdharCard.class);
	         Root<AdharCard> root = query.from(AdharCard.class);
	         query.select(root);
	         Query<AdharCard> q=session.createQuery(query);
	         eList=q.getResultList();
	     
	         tx.commit();		
		}finally{
		session.close();
		//HibernateUtil.closeSessionFactory();
        }

        return eList;
	}

	public List<AdharCard> showAll(String adharCardNumber) {

		Session session =null;
		Transaction tx=null;
		List result=null;
		long userId = 0;
		 try {

			 session=HibenateUtil.getSession();
				tx = session.beginTransaction();
	            String hql = "Select phoneNumber from AdharCard where adharCardNumber=:adharCardNumber"; 
	            
	            System.out.println(hql);
	            Query query = session.createQuery(hql);
	           query.setParameter("adharCardNumber", adharCardNumber);
	         
	            result = query.list();

	            System.out.println(result);           
	    } catch (HibernateException e) {
	        if (session.getTransaction() != null) {
	            session.getTransaction().rollback();
	        }
	    } finally {
	        session.close();
	    }
		return result;
			

	}

	

	

}
