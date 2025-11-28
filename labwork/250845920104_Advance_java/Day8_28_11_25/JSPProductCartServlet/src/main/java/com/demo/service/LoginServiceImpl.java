package com.demo.service;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
		// making object of the Dao
	LoginDao edao;
	
		//default constructor
		public LoginServiceImpl() {
			this.edao = new LoginDaoImpl();
		}

		// validation of the user
		@Override
		public User findUser(String user, String pass) {
			return edao.valiuser(user,pass);
		}
	
}
