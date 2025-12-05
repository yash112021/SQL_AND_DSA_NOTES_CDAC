package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;
import com.demo.beans.Product;

public class TestJoinedTableInheritance {

	public static void main(String[] args) {
	
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		Product p= new Perishable(11,"chips",5,50.5,LocalDate.of(2024, 11, 12), LocalDate.of(2023, 02, 06));
		Product p1 = new NonPerishable(12, "biscuits", 4, 220.23,LocalDate.of(2022, 02, 04),12);
		
		sess.save(p);
		sess.save(p1);
		tr.commit();
		sess.close();
		sf.close();
	}

}
