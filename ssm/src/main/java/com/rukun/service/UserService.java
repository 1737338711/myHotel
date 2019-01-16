package com.rukun.service;

import com.rukun.entity.User;

public interface UserService {
	
	public User findByUsername(String username);
}
