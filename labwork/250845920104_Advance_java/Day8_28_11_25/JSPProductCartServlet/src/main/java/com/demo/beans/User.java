package com.demo.beans;

public class User {
	private int empid;
	private String usr;
	private String pass;
	private String job;
	private String role;
//	Empno | Ename   | pwd        | job     | role 
	
	// default constructor
	public User() {
		super();
	}
	
	// paramterised constructor 
	public User(int empid, String usr, String pass, String job, String role) {
//		super();
		this.empid = empid;
		this.usr = usr;
		this.pass = pass;
		this.job = job;
		this.role = role;
	}

	// now we want the getters and setters 
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// now we want the to String Method in our code
	@Override
	public String toString() {
		return "User [empid=" + empid + ", usr=" + usr + ", pass=" + pass + ", job=" + job + ", role=" + role + "]";
	}
	
	// now we want the to string 
	
}