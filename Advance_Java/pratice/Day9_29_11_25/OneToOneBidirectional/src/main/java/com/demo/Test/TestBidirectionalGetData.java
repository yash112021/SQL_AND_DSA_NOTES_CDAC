package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;

import com.demo.beans.User;

public class TestBidirectionalGetData {

	public static void main(String[] args) {
	

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();

		System.out.println("before get");
		User usr = sess.get(User.class, 2);
		Address a1=sess.get(Address.class, 24);
		
		
		System.out.println("after get");
		System.out.println(usr);
		System.out.println(a1);
		System.out.println(a1.getUsr());
		tr.commit();
		sess.close();
		sf.close();
	}

}
