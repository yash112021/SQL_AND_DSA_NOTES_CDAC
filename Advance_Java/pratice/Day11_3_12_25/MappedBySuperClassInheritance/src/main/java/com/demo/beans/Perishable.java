package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="prishable")
public class Perishable extends Product{

	private LocalDate expdt;

	public Perishable() {
		super();
	}

	public Perishable(int pid, String pname, int qty, double price, LocalDate mfgdate, LocalDate expdt) {
		super(pid, pname, qty, price, mfgdate);
		this.expdt = expdt;
	}

	public LocalDate getExpdt() {
		return expdt;
	}

	public void setExpdt(LocalDate expdt) {
		this.expdt = expdt;
	}

	@Override
	public String toString() {
		return super.toString()+"Perishable [expdt=" + expdt + "]";
	}

	
}
