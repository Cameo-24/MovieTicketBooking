package com.ltts.Dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.model.BookTicket;


@Repository
public class BookTicketDao {

	@Autowired
	private EntityManager em;
	
	@Autowired
	private SessionFactory sf;
	
	public boolean InsertBooking(BookTicket m) {
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(m);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
	
		
		return b;
	}
	
}
