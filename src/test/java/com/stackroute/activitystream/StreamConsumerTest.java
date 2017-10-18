package com.stackroute.activitystream;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.User;

public class StreamConsumerTest {

	@Autowired
	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static UserDAO userDao;

	@Autowired
	private static User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroute.activitystream");
		context.refresh();
		user = (User) context.getBean(User.class);
		userDao = (UserDAO) context.getBean(UserDAO.class);
	}
	
	@Test
	public void addUserTest()
	{
		user.setUid(1);
		user.setFirstName("Ansari Zaid");
		user.setUserName("AansariZaid");
		user.setEmailId("zaid3891@gmail.com");
		user.setLastName("Abdul Rashid");
		user.setPassword("zaid@123");
		userDao.addUser(user);
		assertEquals(user.getClass(), userDao.addUser(user).getClass());
		display(user);
	}
	
	public void display(User user)
	{
		System.out.println(user);
	}
}
