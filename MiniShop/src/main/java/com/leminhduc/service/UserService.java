package com.leminhduc.service;

import org.springframework.stereotype.Service;

import com.leminhduc.dao.UserDao;
 

 
@Service
public interface UserService {

    public boolean isUsers(String username, String password);
    public UserDao getUserDao();
 
    public void setUserDao(UserDao userDao);
}
