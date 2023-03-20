package com.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Alien a=new Alien();
		a.setAid(101);
		a.setAname("Suraj");
		a.setColor("Blue");
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf= con.buildSessionFactory();
		
		Session session =sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(a);
		tx.commit();
		
		
		
		
		
		

	}

}
