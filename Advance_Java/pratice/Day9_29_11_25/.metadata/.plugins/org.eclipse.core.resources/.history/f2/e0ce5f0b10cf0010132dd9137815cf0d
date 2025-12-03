package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.User;

public class TestUnidirOnebyOne {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		
		Address a1 = new Address(12, "chandrapur", 442401);
		User u1 = new User(1, "jyoti", "706679", a1);
		Address a2 = new Address(10, "ballarshah", 442401);
		User u2 = new User(2, "narayan", "76667945", a2);
		
		sess.save(a1);
		sess.save(u1);
		sess.save(a2);
		sess.save(u2);
		
		tr.commit();
		sess.close();
		sf.close();
		


	}

}
