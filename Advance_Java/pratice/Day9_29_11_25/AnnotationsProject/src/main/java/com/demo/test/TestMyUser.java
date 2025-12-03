package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.beans.User;

public class TestMyUser {
		public static void main(String[] args) {
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tr=ss.beginTransaction();
			
			User a=new User(112,"yash","patil");
			User a1=new User(203,"Nayan","patil");
			
			ss.save(a);
			ss.save(a1);
					
			tr.commit();
			ss.close();
					
					
					

		}
}
