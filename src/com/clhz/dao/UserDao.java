package com.clhz.dao;

import com.clhz.model.User;


public interface UserDao {
	
    /**
     * <一句话功能简述>
     * <功能详细描述>
     * @param id
     * @return
     * @see [类、类#方法、类#成员]
     */
    int selectCounts();
    
    User selectByName(String name);
    
    int insertUser(User user);
    
    int updateById(User user);
}