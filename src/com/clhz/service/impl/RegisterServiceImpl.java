package com.clhz.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.clhz.dao.UserDao;
import com.clhz.model.User;
import com.clhz.service.IRegisterService;

@Service("registerService")
public class RegisterServiceImpl implements IRegisterService{
	private static Logger logger = Logger.getLogger(RegisterServiceImpl.class);
	
	@Resource
	private UserDao userDao;

	@Override
	public int insert(User record) {	
		logger.debug("start");
		try {
			return userDao.insertUser(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int countByExample() {
		logger.debug("start");
		try {
			return userDao.selectCounts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
