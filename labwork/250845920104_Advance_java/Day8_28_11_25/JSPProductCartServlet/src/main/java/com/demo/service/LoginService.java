package com.demo.service;

import com.demo.beans.User;

public interface LoginService {

	User findUser(String user, String pass);

	
}
