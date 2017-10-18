package com.stackroute.activitystream.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.stackroute.activitystream.model.User;

@Repository("userDAO")
@Component
public class UserDAOImpl implements UserDAO {

	@Autowired
	List<User> userDao;

	@Override
	public User addUser(User user) {

		try {
			userDao.add(user);
			return user;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		int id = user.getUId();
		for (User u : userDao) {
			if (u.getUId() == user.getUId())
				userDao.remove(user);
		}
	}

	@Override
	public List<User> showAllUser() {
		return userDao;
	}

}
