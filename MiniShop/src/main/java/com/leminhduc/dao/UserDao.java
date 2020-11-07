package com.leminhduc.dao;

import com.leminhduc.model.Users;

public interface UserDao {
	 public Users findByUserName(String username);
}
