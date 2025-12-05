package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.Perishable;
import com.demo.beans.Product;

public class TestGetDataJoinedTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		Product p = sess.get(Perishable.class, 11);
		Product p1 = sess.get(NonPerishable.class, 12);
		System.out.println(p);
		System.out.println(p1);
		tr.commit();
		sess.close();
		sf.close();
	}

}
