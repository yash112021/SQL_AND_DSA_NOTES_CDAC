package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="perishable")
public class Perishable extends Product{
	// date Memeber
	private LocalDate expiredate;

	// default constructor 
	public Perishable() {
//		super();
	}

	// paramterised constructor 
	public Perishable(int pid, String pname, int qty, double price, LocalDate mfgDate, LocalDate expiredate) {
		super(pid, pname, qty, price, mfgDate);
		this.expiredate = expiredate;
	}

	// getters and setters
	public LocalDate getExpiredate() {
		return expiredate;
	}



	public void setExpiredate(LocalDate expiredate) {
		this.expiredate = expiredate;
	}

	// to String Method
	@Override
	public String toString() {
		return super.toString()+"Perishable [expiredate=" + expiredate + "]";
	}
	
	
	
	
}
