package com.leminhduc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leminhduc.dao.UserDao;
import com.leminhduc.model.Users;

@Repository
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
	@Override
	public boolean isUsers(String username, String password) {
		Users user = userDao.findByUserName(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
	}

	@Override
	public UserDao getUserDao() {
        return userDao;
	}

	@Override
	public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
		
	}
	

}
