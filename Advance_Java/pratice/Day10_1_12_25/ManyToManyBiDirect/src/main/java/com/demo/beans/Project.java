package com.demo.beans;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="project11")
public class Project {
	// date memebers id ,name ,startdate, and set of Emplyee working in it 
	@Id
	private int pid;
	private String pname;
	private LocalDate startDate;
	// set of Emplyuee
	@ManyToMany(mappedBy="eset", cascade=CascadeType.ALL)
	Set<Emplyee>eset;
	
	// defalut cosntructor
	public Project() {
		super();
	}

	// parameterised constructor
	public Project(int pid, String pname, LocalDate startDate, Set<Emplyee> eset) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.startDate = startDate;
		this.eset = eset;
	}

	// getters and setters
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Set<Emplyee> getEset() {
		return eset;
	}

	public void setEset(Set<Emplyee> eset) {
		this.eset = eset;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", startDate=" + startDate + ", eset=" + eset + "]";
	}
	
	
	// toString Method 
	
	
	

}
