package com.demo.service;

import com.demo.beans.Emplyee;

public interface LoginService {

	Emplyee validateUser(String name, String pass);

}
