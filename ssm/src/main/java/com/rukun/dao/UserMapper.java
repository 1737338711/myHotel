package com.rukun.dao;

import com.rukun.entity.User;

public interface UserMapper {

	public abstract User findByUsername(String username);
}
