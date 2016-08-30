package com.clhz.dao;

import com.clhz.model.User;


public interface UserDao {
	
    /**
     * <һ�仰���ܼ���>
     * <������ϸ����>
     * @param id
     * @return
     * @see [�ࡢ��#��������#��Ա]
     */
    int selectCounts();
    
    User selectByName(String name);
    
    int insertUser(User user);
    
    int updateById(User user);
}