package com.demo.service;

import com.demo.beans.Emplyee;
import com.demo.dao.DaoLogin;
import com.demo.dao.DaoLoginImpl;

public class LoginServiceImpl implements LoginService {
	// makling the object of the edao;
	DaoLogin edao;

	public LoginServiceImpl() {
		this.edao = new DaoLoginImpl();
	}

	@Override
	public Emplyee validateUser(String name, String pass) {
		return edao.valuser(name,pass);
	}

}
