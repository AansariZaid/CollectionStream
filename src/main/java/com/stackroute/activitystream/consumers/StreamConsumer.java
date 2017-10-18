package com.stackroute.activitystream.consumers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stackroute.activitystream.dao.UserDAO;
import com.stackroute.activitystream.model.User;

@RestController
public class StreamConsumer {

	@Autowired 
	UserDAO userDAO;
	@Autowired
	User user;
	
	@RequestMapping("/")
	public ModelAndView homePage()
	{
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUserservice(@RequestBody User user)
	{
		try {
			User newUser = userDAO.addUser(user);
			return new ResponseEntity<User>(newUser,HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping("/showall")
	public ResponseEntity<List<User>> showAllUsers(HttpSession session)
	{
		return new ResponseEntity<List<User>>(userDAO.showAllUser(),HttpStatus.OK);
	}
	
}
