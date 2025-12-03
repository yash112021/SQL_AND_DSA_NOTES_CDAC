package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Emplyee;
import com.demo.beans.Project;


public class TestManyToManyBiDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Emplyee e1 = new Emplyee( 1,"Jyoti",LocalDate.of(2025,11,11),45561);
		Emplyee e2 = new Emplyee (2, "narayan", LocalDate.of(2025, 04, 04),54325);
		Emplyee e3 = new Emplyee (3, "shivji", LocalDate.of(2025, 07, 05),4325);
		Emplyee e4 = new Emplyee (4, "laxman", LocalDate.of(2025, 04, 06),5325);
		Set<Emplyee> eset1=new HashSet<>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		
		Set<Emplyee> eset2=new HashSet<>();

		eset2.add(e2);
		eset2.add(e3);
		eset2.add(e4);
		
		Project p1 = new Project(11, "p1", LocalDate.of(2024, 02, 21),eset1);
		Project p2 = new Project(12, "p2", LocalDate.of(2022, 04, 22),eset2);
		Project p3 = new Project(13, "p3", LocalDate.of(2023, 06, 24),eset1);
		Set<Project> pset1= new HashSet<>();
		pset1.add(p1);
		pset1.add(p3);
		e1.setEset(pset1);
//		Set<Project> pset2 = new HashSet<>();
//		pset2.add(p1);
//		pset2.add(p2);
//		pset2.add(p3);
//		e2.setEset(pset2);
		
		sess.save(p1);
		sess.save(p2);
		sess.save(p3);
		tr.commit();
		sess.close();
		sf.close();
	}

}
