package com.clhz.service;

import com.clhz.model.User;
import com.clhz.model.UserExample;

public interface IRegisterService {
	
	public int insert(User record);
	
	public int countByExample();

}
