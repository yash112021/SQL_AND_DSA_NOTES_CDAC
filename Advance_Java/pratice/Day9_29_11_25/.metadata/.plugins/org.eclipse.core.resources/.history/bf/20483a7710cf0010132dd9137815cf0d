package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jy_user")
public class User {
	@Id
	private int uid;
	private String uname;
	private String mob_number;

	@OneToOne(fetch=FetchType.LAZY) //fetch lazy will avoid join query
	@JoinColumn(name="aid") //optional

	private Address add;
	public User() {
		super();
	}
	public User(int uid, String uname, String mob_number, Address add) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.mob_number = mob_number;
		this.add = add;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getMob_number() {
		return mob_number;
	}
	public void setMob_number(String mob_number) {
		this.mob_number = mob_number;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", mob_number=" + mob_number + ", add=" + add + "]";
	}
	
}
