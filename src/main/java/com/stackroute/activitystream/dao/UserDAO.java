package com.stackroute.activitystream.dao;

import java.util.List;

import com.stackroute.activitystream.model.User;

public interface UserDAO {

	User addUser(User user);
	void deleteUser(User user);
	List<User> showAllUser();
	
}
