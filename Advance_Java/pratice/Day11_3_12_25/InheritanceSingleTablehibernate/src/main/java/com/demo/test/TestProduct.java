package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;
import com.demo.beans.Product;



public class TestProduct {
	public static void main(String[] args) {
		// creating the SessionFactory Creation Steps 
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		// creating the object of both the child perishable and non-perishable
		
//		int pid, String pname, int qty, double price, LocalDate mfgDate, LocalDate ldt
		Product p=new Perishable(10,"bread",5,500.500,LocalDate.of(2025,12,04),LocalDate.of(2025,12,11));
		Product p1=new NonPerishable(12,"Metal",5,100.100,LocalDate.of(2025, 12, 24),5);
				
		ss.save(p1);
		ss.save(p);
		tr.commit();
		ss.close();
		sf.close();
		
		
				
				
				
		
	}
}
